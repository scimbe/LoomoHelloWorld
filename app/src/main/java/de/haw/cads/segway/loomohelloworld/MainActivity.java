/**
 * (c) 2019  HAW Hamburg CaDS Martin Becke Martin.Becke@HAW-Hamburg.de
 *
 */
package de.haw.cads.segway.loomohelloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private LoomoBaseServiceControl aLoomoBaseServiceControl;
    private LoomoBaseStateManager aLoomoBaseStateManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Start app");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Log.i(TAG, "Start Loomo Base Service Control");
        aLoomoBaseServiceControl = LoomoBaseServiceControl.getInstance(this);
        aLoomoBaseStateManager = LoomoBaseStateManager.getInstance(this);
    }
}
