package rScripts.leaguetasks.task.tasks;

import rScripts.leaguetasks.LeagueScript;
import rScripts.leaguetasks.task.LeagueTask;

/**
 * Created by Reminisce on Mar 04, 2024 at 9:16 PM
 *
 * @author Reminisce <thereminisc3@gmail.com>
 * @Discord reminisce <138751815847116800>
 */
public class OpenLeaguesMenu extends LeagueTask {

    public OpenLeaguesMenu(final LeagueScript script) {
        super(script, "Open the Leagues Menu");
    }

    @Override
    public void run() {
        script.setScriptStatus("Opening up Leagues menu");
        ctx.menuActions.clickButton(42991640);
        ctx.sleep(1000);
    }

}
