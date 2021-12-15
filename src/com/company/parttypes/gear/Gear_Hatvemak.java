package com.company.parttypes.gear;

import com.company.parttypes.gear.type.ManuelGear;

public class Gear_Hatvemak extends ManuelGear /*implements GearBuilder*/ {
    public Gear_Hatvemak() {
        this.number = 5;
        this.model += "Hatvemak";
    }
/*
    @Override
    public Gear createGear() {
        return this;
    }*/
}
