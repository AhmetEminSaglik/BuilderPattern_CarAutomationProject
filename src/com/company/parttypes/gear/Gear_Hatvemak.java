package com.company.parttypes.gear;

import com.company.car.part.body.gear.Gear;
import com.company.interfaces.body.gear.GearBuilder;
import com.company.parttypes.gear.type.ManuelGear;

public class Gear_Hatvemak extends ManuelGear implements GearBuilder /*implements GearBuilder*/ {
    public Gear_Hatvemak() {
        this.number = 5;
        this.model += "Hatvemak";
    }

    @Override
    public Gear createGear() {
        return this;
    }
/*
    @Override
    public Gear createGear() {
        return this;
    }*/
}
