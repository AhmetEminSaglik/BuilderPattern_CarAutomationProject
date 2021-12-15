package com.company.factory;

import com.company.car.part.body.Body;
import com.company.interfaces.car.CarFactory;
import com.company.car.Car;
import com.company.parttypes.brand.Brand_Mclaren;
import com.company.parttypes.ceiling.MoveAbleCeiling;
import com.company.parttypes.gear.Gear_Hatvemak;
import com.company.parttypes.model.Model_McLaren765LT;
import com.company.parttypes.seat.Seat_Aundetechnical;

public class MclarenFactory implements CarFactory {
    private Car car = new Car();
    private Body body = new Body();

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
        body.setSeat(new Seat_Aundetechnical());
    }

    @Override
    public void addGearToBody() {
        body.setGear(new Gear_Hatvemak());

    }

    @Override
    public void addCeilingToBody() {
        body.setCeiling(new MoveAbleCeiling());
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
