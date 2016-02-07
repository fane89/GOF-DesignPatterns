package pl.fane.gof.creational.abstractfactory.factories.green;

import pl.fane.gof.creational.abstractfactory.car.fast.GreenFastCar;
import pl.fane.gof.creational.abstractfactory.car.fast.FastCar;
import pl.fane.gof.creational.abstractfactory.car.slow.GreenSlowCar;
import pl.fane.gof.creational.abstractfactory.car.slow.SlowCar;
import pl.fane.gof.creational.abstractfactory.factories.AbstractCarFactory;

public class GreenCarFactory extends AbstractCarFactory {
    @Override
    public FastCar getFastCar() {
        return new GreenFastCar();
    }

    @Override
    public SlowCar getSlowCar() {
        return new GreenSlowCar();
    }
}
