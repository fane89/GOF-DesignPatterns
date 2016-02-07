package pl.fane.gof.behavioural.strategy.model.algorithm;

public class AlgorithmA implements SpecificAlgorithm{
    @Override
    public void stepA() {
        System.out.println("Algorithm A doing step A");
    }

    @Override
    public void stepB() {
        System.out.println("Algorithm A doing step B");
    }
}
