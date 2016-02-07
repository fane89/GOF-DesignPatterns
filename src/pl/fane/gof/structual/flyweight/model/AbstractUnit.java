package pl.fane.gof.structual.flyweight.model;

public abstract class AbstractUnit {
    private String type;
    private String weapon;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
