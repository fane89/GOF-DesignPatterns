package pl.fane.gof.creational.factorymethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        AbstractProduct a = productFactory.createProduct("A");
        a.doProductStuff();
        AbstractProduct b = productFactory.createProduct("B");
    }
}
