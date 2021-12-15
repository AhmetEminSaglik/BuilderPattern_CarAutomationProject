package com.company.factory;

import com.company.car.Car;
import com.company.car.part.body.Body;
import com.company.interfaces.car.CarFactory;
import com.company.parttypes.brand.Brand_Fiat;
import com.company.parttypes.ceiling.CoveredCeiling;
import com.company.parttypes.gear.Gear_Faster;
import com.company.parttypes.model.Model_Fiat500XSport;
import com.company.parttypes.seat.Seat_Aundetechnical;

public class FiatFactory implements CarFactory {
    private final Car car = new Car();
    private final Body body = new Body();
    private final PartSupplyFactory partSupplyFactory = new PartSupplyFactory(new Gear_Faster(), new Seat_Aundetechnical(), new CoveredCeiling());

    @Override
    public Car getCar() {
        return null;
    }

    @Override
    public void printAllCarInfo() {
        System.out.println(car.toString());
    }

    @Override
    public void addSeatToBody() {
        body.setSeat(new Seat_Aundetechnical());
    }

    @Override
    public void addGearToBody() {
        body.setGear(new Gear_Faster());
    }

    @Override
    public void addCeilingToBody() {
        body.setCeiling(new CoveredCeiling());

    }

    @Override
    public void addBodyToCar() {
        car.setBody(body);
    }

    @Override
    public void createBrand() {
        car.setBrand(new Brand_Fiat());
    }

    @Override
    public void createModel() {
        car.setModel(new Model_Fiat500XSport());
    }
}
