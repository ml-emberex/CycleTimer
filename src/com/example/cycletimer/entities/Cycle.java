package com.example.cycletimer.entities;

import com.example.cycletimer.CycleType;

public class Cycle
{
    public String name;
    public CycleType type;

    public Cycle(String cycleName, CycleType cycleType) {
        name = cycleName;
        type = cycleType;
    }
}
