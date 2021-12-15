package com.company.main;

import com.company.carotomation.CarOtomation;
import com.company.interfaces.car.CarFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CarSelection {

    public CarFactory selectCarToCreate(String carName) {

        try {
            Class<?> clazz = Class.forName(carName);
            Constructor<?> constructor = clazz.getConstructor();
            Object obj = constructor.newInstance();
            CarFactory carOtomation = (CarFactory) clazz.cast(obj);
            return carOtomation;
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return null;

    }
}
