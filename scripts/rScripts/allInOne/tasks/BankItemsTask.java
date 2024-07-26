package rScripts.allInOne.tasks;

import simple.hooks.wrappers.SimpleItem;
import simple.hooks.wrappers.SimpleObject;
import simple.robot.api.ClientContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BankItemsTask {
    private final ClientContext ctx;
    private final List<String> itemsToKeep;

    public BankItemsTask(ClientContext ctx, List<String> itemsToKeep) {
        this.ctx = ctx;
        this.itemsToKeep = itemsToKeep;
    }

    public boolean run() {
        SimpleObject bank = ctx.objects.populate().filter("Bank booth").nearest().next();
        if (bank != null && bank.validateInteractable()) {
            bank.menuAction("Bank");
            if (ctx.onCondition(ctx.bank::bankOpen, 350, 10)) {
                final Set<Integer> depositedIds = new HashSet<>();
                for (final SimpleItem item : ctx.inventory.populate()) {
                    if (itemsToKeep.contains(item.getName()) || depositedIds.contains(item.getId())) {
                        continue;
                    }
                    item.menuAction("Deposit-All");
                    depositedIds.add(item.getId());
                    ctx.sleep(50, 150);
                }
                ctx.sleep(1250);
                ctx.bank.closeBank();

                // Wait until the inventory only contains items to keep
                if (ctx.onCondition(() -> ctx.inventory.populate().toStream()
                        .allMatch(item -> itemsToKeep.contains(item.getName())), 250, 20)) {
                    return true;
                } else {
                    System.err.println("Error: Trouble depositing items.");
                    return false;
                }
            }
        } else {
            System.err.println("Error: Bank not found.");
        }
        return false;
    }
}