package com.example.cycletimer.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.example.cycletimer.entities.Cycle;

//TODO: make this a factory
public class CycleView extends View
{
    private Cycle cycle;
    
    CycleView(Context context, Cycle cycle)
    {
        super(context);
        this.cycle = cycle;
    }
    
    //book said good idea to accept attributeset in case constructed from xml
    CycleView(Context context, AttributeSet attributeSet)
    {
        super(context);
        //TODO: finish this constructor
    }

    public String getCycleName()
    {
        return cycle.name;
    }
}
