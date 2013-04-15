package com.example.cycletimer;

import java.util.ArrayList;

import android.app.Activity;
import android.widget.ListView;

import com.example.cycletimer.adapters.CycleAdapter;
import com.example.cycletimer.views.CycleView;

public class CycleManager
{
    private ArrayList<CycleView> cycles = new ArrayList<CycleView>();
    private CycleAdapter cycleAdapter;

    CycleManager(Activity activity) {
    	ListView listView = (ListView) activity.findViewById(R.id.mainCyclesList);
    	cycleAdapter = new CycleAdapter(activity, R.layout.cycle_view, cycles);
    	createCycle(activity.getString(R.string.new_cycle), CycleType.NEW);
        listView.setAdapter(cycleAdapter);
    }
    
    private CycleView createCycle(String cycleName, CycleType type)
    {
    	int indexLocation = cycles.size() == 0 ? 0 : cycles.size() - 1;
    	CycleView cycle = CycleFactory.createCycle(cycleName, type);
//    	Cycle cycle = new Cycle(cycleName, CycleType.NEW);
    	cycles.add(indexLocation, cycle);
    	
    	return cycle;
    }

}
