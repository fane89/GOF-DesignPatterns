package pl.fane.gof.creational.factorymethod;

public class ProductA extends AbstractProduct {

    @Override
    public void doProductStuff() {
        System.out.println(this.getClass() + " is doing stuff");
    }
}
