package com.company.car.part.body.gear;

public abstract class Gear {
    protected String model;
    protected int number;

    @Override
    public String toString() {
        return "Gear    {" +
                " " + model +
                ", (number): " + number +
                " }";
    }
}
