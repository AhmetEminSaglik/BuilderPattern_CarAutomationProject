package com.company.main;

import com.company.interfaces.car.CarFactory;
import com.company.carotomation.CarOtomation;
import com.company.factory.MclarenFactory;

public class Main {
    public static void main(String[] args) {

        CarSelection carSelection = new CarSelection();

        String carPath = MclarenFactory.class.getName();

        CarFactory selectedCarFactory = carSelection.selectCarToCreate(carPath);

        CarOtomation carOtomation = new CarOtomation(selectedCarFactory);
        carOtomation.printCarData();




    /*    CarFactory hyundaliFactory = new HyundaiFactory();
        CarFactory fiatFactory = new FiatFactory();
        CarFactory mclarenFactory = new MclarenFactory();

        CarOtomation carOtomation = new CarOtomation(hyundaliFactory);
        carOtomation.printCarData();
        System.out.println("=====================");

        carOtomation = new CarOtomation(fiatFactory);
        carOtomation.printCarData();
        System.out.println("=====================");

        carOtomation = new CarOtomation(mclarenFactory);
        carOtomation.printCarData();
*/
    }
}
