package pl.fane.gof.behavioural.strategy;

import pl.fane.gof.behavioural.strategy.model.algorithm.AlgorithmA;
import pl.fane.gof.behavioural.strategy.model.algorithm.AlgorithmB;
import pl.fane.gof.behavioural.strategy.model.algorithm.SpecificAlgorithm;
import pl.fane.gof.behavioural.strategy.model.streategy.ConcreteStrategyA;
import pl.fane.gof.behavioural.strategy.model.streategy.ConcreteStrategyB;

public class StrategyMain {
    public static void main(String[] args) {

        SpecificAlgorithm algorithmA = new AlgorithmA();
        SpecificAlgorithm algorithmB = new AlgorithmB();

        new ConcreteStrategyA(algorithmA).doAlgorithm();
        new ConcreteStrategyA(algorithmB).doAlgorithm();
        new ConcreteStrategyB(algorithmA).doAlgorithm();
        new ConcreteStrategyB(algorithmB).doAlgorithm();
    }
}
