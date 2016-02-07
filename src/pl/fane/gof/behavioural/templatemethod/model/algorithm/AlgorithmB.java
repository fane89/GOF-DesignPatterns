package pl.fane.gof.behavioural.templatemethod.model.algorithm;

public class AlgorithmB implements SpecificAlgorithm {
    @Override
    public void stepA() {
        System.out.println("Algorithm B doing step A");
    }

    @Override
    public void stepB() {
        System.out.println("Algorithm B doing step B");
    }
}
