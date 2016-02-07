package pl.fane.gof.behavioural.state.model;

public class ConcreteStateA extends AbstractState {
    @Override
    public void handle(Context context) {
        System.out.println("Handle context from A");
        context.setState(new ConcreteStateB());
    }
}
