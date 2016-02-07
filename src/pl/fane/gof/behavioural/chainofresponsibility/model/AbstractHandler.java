package pl.fane.gof.behavioural.chainofresponsibility.model;

public abstract class AbstractHandler {
    protected AbstractHandler successor;

    public abstract void doResponsibility(String stuff);

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }
}
