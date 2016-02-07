package pl.fane.gof.behavioural.strategy.model.streategy;

import pl.fane.gof.behavioural.strategy.model.algorithm.SpecificAlgorithm;

public class ConcreteStrategyA extends AbstractStrategy {

    public ConcreteStrategyA(SpecificAlgorithm specificAlgorithm) {
        super(specificAlgorithm);
    }

    @Override
    public void doAlgorithm() {
        specificAlgorithm.stepA();
        specificAlgorithm.stepB();
    }
}
