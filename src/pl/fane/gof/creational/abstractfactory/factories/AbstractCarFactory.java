package pl.fane.gof.creational.abstractfactory.factories;

import pl.fane.gof.creational.abstractfactory.car.AbstractCar;

public abstract class AbstractCarFactory {

    public abstract AbstractCar getFastCar();

    public abstract AbstractCar getSlowCar();
}
