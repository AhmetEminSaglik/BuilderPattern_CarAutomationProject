package com.company.car.part.model;

public abstract class Model {
    protected String model;

    @Override
    public String toString() {
        return "Model { " +
                "" + model +
                " } ";
    }
}
