package com.company.parttypes.gear;

import com.company.car.part.body.gear.Gear;
import com.company.interfaces.body.gear.GearBuilder;
import com.company.parttypes.gear.type.AutomaticGear;

public class Gear_Faster extends AutomaticGear implements GearBuilder {
    public Gear_Faster() {
        this.model +="AkvasKe";
    }

    @Override
    public Gear createGear() {
        return this;
    }
}
