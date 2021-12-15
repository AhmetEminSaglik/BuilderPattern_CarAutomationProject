package com.company.car;

import com.company.car.part.body.Body;
import com.company.car.part.brand.Brand;
import com.company.car.part.model.Model;

public class Car {
    private Brand brand;
    private Body body;
    private Model model;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "\n\t" + brand +
                "\n\t" + body +
                "\n\t" + model +
                "\n   }";
    }
}
