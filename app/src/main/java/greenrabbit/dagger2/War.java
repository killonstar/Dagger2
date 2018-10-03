package greenrabbit.dagger2;

import javax.inject.Inject;

/**
 * Created by Sergey on 02.10.2018.
 */

public class War {
    private One one;
    private Two two;

    @Inject
    public War(One one, Two two) {
        this.one = one;
        this.two = two;
    }

    public void prepare(){
        one.prepareWar();
        two.prepareWar();
    }
    public void report(){
        one.reportWar();
        two.reportWar();
    }
}
