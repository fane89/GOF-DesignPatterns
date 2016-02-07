package pl.fane.gof.structual.adapter.legacy;

public class LegacyClass implements LegacyInterface {

    @Override
    public void doThis() {
        System.out.println("Doing this");
    }

    @Override
    public void doThat() {
        System.out.println("Doing that");
    }

    @Override
    public void andDoThisToo() {
        System.out.println("Doing this too");
    }
}
