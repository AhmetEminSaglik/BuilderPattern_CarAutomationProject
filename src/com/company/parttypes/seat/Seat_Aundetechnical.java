package com.company.parttypes.seat;

import com.company.car.part.body.seat.Seat;
import com.company.interfaces.body.seat.SeatBuilder;

public class Seat_Aundetechnical extends Seat implements SeatBuilder {
    public Seat_Aundetechnical() {
        this.seat = "Aunde Technical";
    }

    @Override
    public Seat createSeat() {
        return this;
    }
}
