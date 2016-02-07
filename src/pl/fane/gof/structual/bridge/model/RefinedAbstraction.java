package pl.fane.gof.structual.bridge.model;

import pl.fane.gof.structual.bridge.model.bridge.ConcreteImplementation;

public class RefinedAbstraction extends AbstractTop {

    public RefinedAbstraction() {
        implementationBase = new ConcreteImplementation();
    }

    @Override
    public void operation() {
        implementationBase.operationImplementation();
    }
}
