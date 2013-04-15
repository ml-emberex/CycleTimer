package com.example.cycletimer;

import java.util.ArrayList;

import android.app.Activity;
import android.widget.ListView;

import com.example.cycletimer.adapters.CycleAdapter;
import com.example.cycletimer.entities.Cycle;

public class CycleManager
{
    private ArrayList<Cycle> cycles = new ArrayList<Cycle>();
    private CycleAdapter cycleAdapter;

    CycleManager(Activity activity) {
    	ListView listView = (ListView) activity.findViewById(R.id.mainCyclesList);
    	cycleAdapter = new CycleAdapter(activity, R.layout.cycle_view, cycles);
    	createCycle(activity.getString(R.string.new_cycle), CycleType.NEW);
        listView.setAdapter(cycleAdapter);
    }
    
    private Cycle createCycle(String cycleName, CycleType type)
    {
    	int indexLocation = cycles.size() == 0 ? 0 : cycles.size() - 1;
    	Cycle cycle = new Cycle(cycleName, CycleType.NEW);
    	cycles.add(indexLocation, cycle);
    	
    	return cycle;
    }

}
