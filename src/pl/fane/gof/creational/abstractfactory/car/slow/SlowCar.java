package pl.fane.gof.creational.abstractfactory.car.slow;

import pl.fane.gof.creational.abstractfactory.car.AbstractCar;

public abstract class SlowCar extends AbstractCar {
    @Override
    public String getSpeed() {
        return "Slow";
    }
}
