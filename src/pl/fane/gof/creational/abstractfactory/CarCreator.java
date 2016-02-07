package pl.fane.gof.creational.abstractfactory;

import pl.fane.gof.creational.abstractfactory.factories.AbstractCarFactory;

public class CarCreator {

    private final AbstractCarFactory abstractCarFactory;

    public CarCreator(AbstractCarFactory abstractCarFactory) {
        this.abstractCarFactory = abstractCarFactory;
    }

    public void showCars(){
        System.out.println(abstractCarFactory.getFastCar().getSpeed() + abstractCarFactory.getFastCar().getCarColor());
        System.out.println(abstractCarFactory.getSlowCar().getSpeed() + abstractCarFactory.getSlowCar().getCarColor());
    }



}
