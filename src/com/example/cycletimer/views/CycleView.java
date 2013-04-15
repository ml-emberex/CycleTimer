package com.example.cycletimer.views;

import android.view.View.OnClickListener;

import com.example.cycletimer.entities.Cycle;

public class CycleView
{
    private Cycle cycle;
    OnClickListener onClickListener;
    
    public CycleView(Cycle cycle)
    {
        this.cycle = cycle;
    }
    
    public String getName()
    {
        return cycle.name;
    }

    public OnClickListener getOnClickListener()
    {
        return onClickListener;
    }
    
    public void setOnClickListener(OnClickListener listener)
    {
        onClickListener = listener;
    }

}
