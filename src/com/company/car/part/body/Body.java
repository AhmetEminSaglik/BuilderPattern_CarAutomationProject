package com.company.car.part.body;

import com.company.car.part.body.seat.Seat;
import com.company.car.part.body.ceiling.Ceiling;
import com.company.car.part.body.gear.Gear;

public class Body {
    private Ceiling ceiling;
    private Seat seat;
    private Gear gear;

    @Override
    public String toString() {
        return "Body  {" +
                "\n\t\t" + ceiling +
                "\n\t\t" + seat +
                "\n\t\t" + gear +
                "\n\t\t  }";
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Gear getGear() {
        return gear;
    }

    public void setGear(Gear gear) {
        this.gear = gear;
    }
}
