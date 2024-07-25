package rScripts.leaguetasks.task.tasks;

import rScripts.leaguetasks.LeagueScript;
import rScripts.leaguetasks.data.LeagueScriptConstants;
import rScripts.leaguetasks.task.LeagueTask;
import net.runelite.api.coords.WorldPoint;
import simple.hooks.wrappers.SimpleObject;

/**
 * Created by Reminisce on Mar 06, 2024 at 11:21 PM
 *
 * @author Reminisce <thereminisc3@gmail.com>
 * @Discord reminisce <138751815847116800>
 */
public class CraftGhorrockTablet extends LeagueTask {

    private static final WorldPoint LECTERN_TILE = new WorldPoint(2078, 3914, 0);

    /**
     * While completing this task, we will also complete the following tasks:
     * - Create a Catherby Teleport Tablet
     */
    public CraftGhorrockTablet(final LeagueScript script) {
        super(script, "Craft a Ghorrock Teleport Tablet");
    }

    @Override
    public void run() {
        if (!ctx.pathing.regionLoaded(LeagueScriptConstants.LUNAR_ISLE_REGION_ID)) {
            if (!teleportHome()) {
                return;
            }
            if (ctx.teleporter.open()) {
                script.setScriptStatus("Teleporting to Lunar isle");
                ctx.teleporter.teleportStringPath("Cities", "Lunar isle");
                ctx.onCondition(() -> ctx.pathing.regionLoaded(LeagueScriptConstants.LUNAR_ISLE_REGION_ID), 250, 10);
                return;
            }
        }
        if (!ctx.pathing.onTile(LECTERN_TILE)) {
            script.setScriptStatus("Navigating to lectern");
            ctx.menuActions.step(LECTERN_TILE);
            ctx.sleep(500, 1000);
            return;
        }
        final SimpleObject lectern = ctx.objects.populate().filter("Lectern").nextNearest();
        if (lectern == null) {
            return;
        }
        script.setScriptStatus("Crafting Ghorrock tablet");
        lectern.menuAction("Study");
        ctx.onCondition(this::isCompleted, 350, 10);
    }
}
