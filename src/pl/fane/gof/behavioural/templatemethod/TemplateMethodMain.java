package pl.fane.gof.behavioural.templatemethod;

import pl.fane.gof.behavioural.templatemethod.model.algorithm.AlgorithmA;
import pl.fane.gof.behavioural.templatemethod.model.algorithm.SpecificAlgorithm;

public class TemplateMethodMain {
    public static void main(String[] args) {
        SpecificAlgorithm specificAlgorithm = new AlgorithmA();

        specificAlgorithm.stepA();
        specificAlgorithm.stepB();
    }
}
