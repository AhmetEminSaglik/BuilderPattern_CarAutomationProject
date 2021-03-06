package com.company.carotomation;

import com.company.interfaces.car.CarFactory;

public class CarOtomation {

    CarFactory carFactory;

    public CarOtomation(CarFactory carFactory) {
        this.carFactory = carFactory;
        carFactory.addGearToBody();
        carFactory.addSeatToBody();
        carFactory.addCeilingToBody();
        carFactory.addBodyToCar();
        carFactory.createModel();
        carFactory.createBrand();
    }

    public void printCarData() {
        carFactory.printAllCarInfo();
    }
}
