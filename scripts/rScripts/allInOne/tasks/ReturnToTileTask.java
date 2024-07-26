package rScripts.allInOne.tasks;

import net.runelite.api.coords.WorldPoint;
import simple.robot.api.ClientContext;

public class ReturnToTileTask {
    private final ClientContext ctx;
    private final WorldPoint returnTile;

    public ReturnToTileTask(ClientContext ctx, WorldPoint returnTile) {
        this.ctx = ctx;
        this.returnTile = returnTile;
    }

    public void run() {
        if (returnTile != null) {
            ctx.pathing.step(returnTile);
            ctx.onCondition(() -> ctx.players.getLocal().getLocation().equals(returnTile), 250, 10);
        }
    }
}