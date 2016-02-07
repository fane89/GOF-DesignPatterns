package pl.fane.gof.behavioural.state;

import pl.fane.gof.behavioural.state.model.ConcreteStateA;
import pl.fane.gof.behavioural.state.model.ConcreteStateB;
import pl.fane.gof.behavioural.state.model.Context;

public class StateMain {

    public static void main(String[] args) {
        ConcreteStateA concreteStateA = new ConcreteStateA();
        Context context = new Context(concreteStateA);
        for (int i = 0; i < 10; i++) {
            context.request();
        }
    }
}
