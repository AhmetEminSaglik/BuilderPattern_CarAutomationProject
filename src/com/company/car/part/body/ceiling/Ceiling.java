package com.company.car.part.body.ceiling;

import com.company.interfaces.body.ceiling.CeilingBuilder;

public abstract class Ceiling implements CeilingBuilder {
    protected String ceiling;

    @Override
    public String toString() {
        return "Ceiling { " +
                "" + ceiling + ' ' +
                '}';
    }
}
