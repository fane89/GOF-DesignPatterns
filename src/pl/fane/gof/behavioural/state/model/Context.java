package pl.fane.gof.behavioural.state.model;

public class Context {

    private AbstractState state;

    public Context(AbstractState state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }
}
