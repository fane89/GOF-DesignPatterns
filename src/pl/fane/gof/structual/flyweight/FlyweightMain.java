package pl.fane.gof.structual.flyweight;

import pl.fane.gof.structual.flyweight.model.AbstractUnit;
import pl.fane.gof.structual.flyweight.model.FlyweightFactory;

import java.util.ArrayList;

public class FlyweightMain {
    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        ArrayList<AbstractUnit> abstractUnits = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            abstractUnits.add(flyweightFactory.getUnit("Soldier"));
        }
        for (int i = 0; i < 10; i++) {
            abstractUnits.add(flyweightFactory.getUnit("Tank"));
        }

        abstractUnits.stream().forEach(System.out::println);
    }
}
