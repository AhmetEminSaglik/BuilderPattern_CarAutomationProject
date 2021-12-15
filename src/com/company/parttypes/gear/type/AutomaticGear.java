package com.company.parttypes.gear.type;

import com.company.car.part.body.gear.Gear;

public abstract class AutomaticGear extends Gear {
    public AutomaticGear() {
        this.model = "Automatic, ";
        this.number = 2;
    }
}
