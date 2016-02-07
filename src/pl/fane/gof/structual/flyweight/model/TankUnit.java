package pl.fane.gof.structual.flyweight.model;

public class TankUnit extends AbstractUnit {
    @Override
    public void setType(String type) {
        super.setType("Tank " + type);
    }

    @Override
    public void setWeapon(String weapon) {
        super.setWeapon("Tank " + weapon);
    }
}
