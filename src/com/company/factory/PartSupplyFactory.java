package com.company.factory;

import com.company.car.part.body.ceiling.Ceiling;
import com.company.car.part.body.gear.Gear;
import com.company.car.part.body.seat.Seat;
import com.company.interfaces.body.ceiling.CeilingBuilder;
import com.company.interfaces.body.gear.GearBuilder;
import com.company.interfaces.body.seat.SeatBuilder;

public class PartSupplyFactory implements GearBuilder, SeatBuilder, CeilingBuilder {
    private GearBuilder gearBuilder;
    private SeatBuilder seatBuilder;
    private CeilingBuilder ceilingBuilder;


    public PartSupplyFactory(GearBuilder gearBuilder, SeatBuilder seatBuilder, CeilingBuilder ceilingBuilder) {
        this.gearBuilder = gearBuilder;
        this.seatBuilder = seatBuilder;
        this.ceilingBuilder = ceilingBuilder;
//        this.seatBuilder = seatBuilder;
    }


    @Override
    public Ceiling createCeiling() {
        return ceilingBuilder.createCeiling();
    }

    @Override
    public Gear createGear() {
        return gearBuilder.createGear();
    }

    @Override
    public Seat createSeat() {
        return seatBuilder.createSeat();
    }
}
