package com.example.cycletimer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class CycleTimerActivity extends Activity {

	private CycleManager cycleManager;
    @Override 
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_cycle_layout);
        cycleManager = new CycleManager(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.cycle_timer, menu);
        return true;
    }
}
