package com.example.cycletimer.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.cycletimer.R;
import com.example.cycletimer.entities.Cycle;

public class CycleAdapter extends ArrayAdapter<Cycle>
{
    private int viewResourceId;
    private LayoutInflater layoutInflater;
    private List<Cycle> cycles;

    public CycleAdapter(Context context, int viewResourceId, List<Cycle> cycles)
    {
        super(context, viewResourceId, cycles);
        this.cycles = cycles;
        this.viewResourceId = viewResourceId;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(viewResourceId, parent, false);

        TextView textView;
        textView = (TextView)view.findViewById(R.id.cycle_name);
        Cycle cycleView = cycles.get(position);
        textView.setText(cycleView.name);

        return view;
    }
}
