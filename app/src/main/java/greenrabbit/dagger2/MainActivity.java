package greenrabbit.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dagger.Component;

@Component
interface BattleComponent{
    War getWar();
}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
