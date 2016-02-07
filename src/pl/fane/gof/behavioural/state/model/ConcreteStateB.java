package pl.fane.gof.behavioural.state.model;

public class ConcreteStateB extends AbstractState{
    @Override
    public void handle(Context context) {
        System.out.println("Handle context from B");
        context.setState(new ConcreteStateA());
    }
}
