package com.company.factory;

import com.company.car.part.body.Body;
import com.company.interfaces.car.CarFactory;
import com.company.car.Car;
import com.company.parttypes.brand.Brand_Hyundai;
import com.company.parttypes.ceiling.UncoveredCeiling;
import com.company.parttypes.gear.Gear_Hatvemak;
import com.company.parttypes.model.Model_HyundaiAuraRs;
import com.company.parttypes.seat.Seat_OtomAlfaRomeo;

public class HyundaiFactory implements CarFactory {
    private final Car car = new Car();
    private final Body body = new Body();
    private final PartSupplyFactory partSupplyFactory = new PartSupplyFactory(new Gear_Hatvemak(), new Seat_OtomAlfaRomeo(), new UncoveredCeiling());

    @Override
    public void createBrand() {
        car.setBrand(new Brand_Hyundai());
    }

    @Override
    public void createModel() {
        car.setModel(new Model_HyundaiAuraRs());
    }

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
    public void addGearToBody() {
        body.setGear(partSupplyFactory.createGear());

    }

    @Override
    public void addCeilingToBody() {
        body.setCeiling(partSupplyFactory.createCeiling());
    }

    @Override
    public void addBodyToCar() {
        car.setBody(body);
    }


}
