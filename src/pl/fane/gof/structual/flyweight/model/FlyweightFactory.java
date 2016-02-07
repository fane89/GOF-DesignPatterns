package pl.fane.gof.structual.flyweight.model;

import java.util.HashMap;

public class FlyweightFactory {

    private HashMap<String, AbstractUnit> unitHashMap;

    public FlyweightFactory() {
        this.unitHashMap = new HashMap<>();
    }

    public AbstractUnit getUnit(String type) {
        if (unitHashMap.containsKey(type)) {
            return unitHashMap.get(type);
        }
        switch (type) {
            case "Tank":
                TankUnit tankUnit = new TankUnit();
                unitHashMap.put(type, tankUnit);
                return tankUnit;
            case "Soldier":
                SoldierUnit soldierUnit = new SoldierUnit();
                unitHashMap.put(type, soldierUnit);
                return soldierUnit;
            default:
                throw new IllegalArgumentException(type + " not supported");
        }
    }
}
