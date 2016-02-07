package pl.fane.gof.creational.abstractfactory.car.fast;

import pl.fane.gof.creational.abstractfactory.car.AbstractCar;

public abstract class FastCar extends AbstractCar {
    @Override
    public String getSpeed() {
        return "Fast";
    }
}
