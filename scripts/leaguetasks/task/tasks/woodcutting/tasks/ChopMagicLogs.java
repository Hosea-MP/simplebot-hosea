package leaguetasks.task.tasks.woodcutting.tasks;

import leaguetasks.LeagueScript;
import leaguetasks.task.LeagueTask;
import leaguetasks.task.tasks.woodcutting.WoodcuttingCore;
import leaguetasks.task.tasks.woodcutting.WoodcuttingTree;

/**
 * Created by Reminisce on Mar 08, 2024 at 12:13 AM
 *
 * @author Reminisce <thereminisc3@gmail.com>
 * @Discord reminisce <138751815847116800>
 */
public class ChopMagicLogs extends LeagueTask {

    private final WoodcuttingCore woodcuttingCore;

    public ChopMagicLogs(final LeagueScript script) {
        super(script, "Chop 75 Magic Logs");
        this.woodcuttingCore = new WoodcuttingCore(script, this.getName(), WoodcuttingTree.MAGIC);
    }

    @Override
    public void run() {
        this.woodcuttingCore.run();
    }

}
