package leaguetasks.task.requirement;

import simple.robot.api.ClientContext;

/**
 * Created by Reminisce on Mar 04, 2024 at 8:55 PM
 *
 * @author Reminisce <thereminisc3@gmail.com>
 * @Discord reminisce <138751815847116800>
 */
public abstract class Requirement {

    public final ClientContext ctx;

    public Requirement(final ClientContext ctx) {
        this.ctx = ctx;
    }

    public abstract boolean isMet();

}
