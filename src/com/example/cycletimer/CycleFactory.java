package com.example.cycletimer;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.cycletimer.entities.Cycle;
import com.example.cycletimer.views.CycleView;

public class CycleFactory {

    public static CycleView createCycle(String cycleName, CycleType type) {
        Cycle cycle = new Cycle(cycleName, CycleType.NEW);
        return createCycleView(cycle);
    }

    private static CycleView createCycleView(Cycle cycle)
    {
        CycleView cycleView = new CycleView(cycle);
        switch(cycle.type)
        {
        case NEW:
            cycleView.setOnClickListener(getCycleNewListener());
            return cycleView;
        case REPEATABLE:
        default:
            cycleView.setOnClickListener(getCycleRepeatableClickListener());
            return cycleView;
        }
    }

    private static OnClickListener getCycleRepeatableClickListener()
    {
        return new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                //TODO: obviously do different stuff here
                Log.d("CycleFactory", "Repeatable Clicked");
            }
        };
    }

    private static OnClickListener getCycleNewListener()
    {
        return new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                //TODO: obviously do different stuff here
                Log.d("CycleFactory", "NEW clicked");
            }
        };
    }
}
