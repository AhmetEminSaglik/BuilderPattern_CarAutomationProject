package com.company.parttypes.seat;

import com.company.car.part.body.seat.Seat;
import com.company.interfaces.body.seat.SeatBuilder;

public class Seat_OtomAlfaRomeo extends Seat implements SeatBuilder {
    public Seat_OtomAlfaRomeo() {
        this.seat = "Otom Alfa Romeo";
    }

    @Override
    public Seat createSeat() {
        return this;
    }

}
