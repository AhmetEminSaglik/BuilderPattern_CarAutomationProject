package com.company.parttypes.ceiling;

import com.company.car.part.body.ceiling.Ceiling;

public class MoveAbleCeiling extends Ceiling {
    public MoveAbleCeiling() {
        this.ceiling = "Moveable";
    }

    @Override
    public Ceiling createCeiling() {
        return this;
    }
}
