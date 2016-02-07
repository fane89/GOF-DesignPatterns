package pl.fane.gof.behavioural.strategy.model.streategy;

public class StrategyHolder {

    AbstractStrategy strategy;

    public AbstractStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }
}
