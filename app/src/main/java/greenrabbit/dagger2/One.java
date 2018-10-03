package greenrabbit.dagger2;

import javax.inject.Inject;

/**
 * Created by Sergey on 02.10.2018.
 */

public class One implements House {

    @Inject
    public One() {
    }

    @Override
    public void prepareWar() {
        int a;
        a = 5 + 5;
        System.out.println(this.getClass().getSimpleName() + a);
    }

    @Override
    public void reportWar() {
        int a;
        a = 10-9;
        System.out.println(this.getClass().getSimpleName() + a);
    }
}
