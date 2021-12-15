package com.company.factory;

import com.company.car.part.body.Body;
import com.company.interfaces.car.CarFactory;
import com.company.car.Car;
import com.company.parttypes.brand.Brand_Mclaren;
import com.company.parttypes.ceiling.MoveAbleCeiling;
import com.company.parttypes.gear.Gear_Hatvemak;
import com.company.parttypes.model.Model_McLaren765LT;
import com.company.parttypes.seat.Seat_OtomAlfaRomeo;

public class MclarenFactory implements CarFactory {
    private final Car car = new Car();
    private final Body body = new Body();
    private final PartSupplyFactory partSupplyFactory = new PartSupplyFactory(new Gear_Hatvemak(), new Seat_OtomAlfaRomeo(), new MoveAbleCeiling());

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public void printAllCarInfo() {
        System.out.println(car.toString());
    }

    @Override
    public void addSeatToBody() {
        body.setSeat(partSupplyFactory.createSeat());
    }

    @Override
    public void addGearToBody() {body.setGear(partSupplyFactory.createGear());}

    @Override
    public void addCeilingToBody() {
        body.setCeiling(partSupplyFactory.createCeiling());
    }

    @Override
    public void addBodyToCar() {
        car.setBody(body);
    }

    @Override
    public void createBrand() {
        car.setBrand(new Brand_Mclaren());
    }

    @Override
    public void createModel() {
        car.setModel(new Model_McLaren765LT());
    }
}
