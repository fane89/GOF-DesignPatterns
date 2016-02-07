package pl.fane.gof.creational.abstractfactory;

import pl.fane.gof.creational.abstractfactory.factories.green.GreenCarFactory;
import pl.fane.gof.creational.abstractfactory.factories.AbstractCarFactory;
import pl.fane.gof.creational.abstractfactory.factories.red.RedCarFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        AbstractCarFactory redCarFactory = new RedCarFactory();
        CarCreator redCarCreator = new CarCreator(redCarFactory);
        redCarCreator.showCars();

        AbstractCarFactory greenCarFactory = new GreenCarFactory();
        CarCreator greenCarCreator = new CarCreator(greenCarFactory);
        greenCarCreator.showCars();
    }
}
