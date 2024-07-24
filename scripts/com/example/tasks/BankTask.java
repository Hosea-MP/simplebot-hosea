package com.example.tasks;

import simple.hooks.scripts.task.Task;
import simple.robot.api.ClientContext;

public class BankTask extends Task {

    public BankTask(ClientContext ctx) {
        super(ctx);
    }

    @Override
    public boolean condition() {
        return ctx.inventory.inventoryFull() && !ctx.players.getLocal().isAnimating() && ctx.players.getLocal().getInteracting() == null;
    }

    @Override
    public void run() {
        if (!ctx.bank.bankOpen()) {
            ctx.bank.openBank();
        }
    }

    @Override
    public String status() {
        return "Opening bank";
    }
}