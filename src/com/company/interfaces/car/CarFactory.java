package com.company.interfaces.car;

import com.company.car.Car;
import com.company.interfaces.body.BodyFactory;
import com.company.interfaces.brand.BrandBuilder;
import com.company.interfaces.model.ModelBuilder;

public interface CarFactory extends BodyFactory, BrandBuilder, ModelBuilder {
    Car getCar();
    void printAllCarInfo();

}
