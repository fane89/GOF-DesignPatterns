package pl.fane.gof.structual.proxy.model;

public class RealSubject extends AbstractSubject {
    @Override
    public void doOperation() {
        System.out.println("Doing real operation");
    }
}
