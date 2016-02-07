package pl.fane.gof.creational.abstractfactory.factories.red;

import pl.fane.gof.creational.abstractfactory.car.fast.FastCar;
import pl.fane.gof.creational.abstractfactory.car.fast.RedFastCar;
import pl.fane.gof.creational.abstractfactory.car.slow.RedSlowCar;
import pl.fane.gof.creational.abstractfactory.car.slow.SlowCar;
import pl.fane.gof.creational.abstractfactory.factories.AbstractCarFactory;

public class RedCarFactory extends AbstractCarFactory {
    @Override
    public FastCar getFastCar() {
        return new RedFastCar();
    }

    @Override
    public SlowCar getSlowCar() {
        return new RedSlowCar();
    }
}
