package pl.fane.gof.behavioural.strategy.model.streategy;

import pl.fane.gof.behavioural.strategy.model.algorithm.SpecificAlgorithm;

public class ConcreteStrategyB extends AbstractStrategy {

    public ConcreteStrategyB(SpecificAlgorithm specificAlgorithm) {
        super(specificAlgorithm);
    }

    @Override
    public void doAlgorithm() {
        specificAlgorithm.stepB();
        specificAlgorithm.stepA();
    }
}
