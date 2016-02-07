package pl.fane.gof.structual.flyweight.model;

public class SoldierUnit extends AbstractUnit {

    @Override
    public void setType(String type) {
        super.setType("Soldier " + type);
    }

    @Override
    public void setWeapon(String weapon) {
        super.setWeapon("M4A1 " + weapon);
    }
}
