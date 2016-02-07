package pl.fane.gof.structual.bridge.model.bridge;

public class ConcreteImplementation implements ImplementationBase {
    @Override
    public void operationImplementation() {
        System.out.println("Concrete implementation operation :)");
    }
}
