package pl.fane.gof.creational.factorymethod;

public class ProductFactory {

    public AbstractProduct createProduct(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            default:
                throw new UnsupportedOperationException("Given type not supported - " + type);
        }
    }
}
