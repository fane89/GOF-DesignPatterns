package pl.fane.gof.behavioural.strategy.model.streategy;

import pl.fane.gof.behavioural.strategy.model.algorithm.SpecificAlgorithm;

public abstract class AbstractStrategy {

    protected SpecificAlgorithm specificAlgorithm;

    public AbstractStrategy(SpecificAlgorithm specificAlgorithm) {
        this.specificAlgorithm = specificAlgorithm;
    }

    public abstract void doAlgorithm();
}
