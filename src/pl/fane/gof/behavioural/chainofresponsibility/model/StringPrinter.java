package pl.fane.gof.behavioural.chainofresponsibility.model;

public class StringPrinter extends AbstractHandler {
    @Override
    public void doResponsibility(String stuff) {
        System.out.println(stuff);
        if (successor != null) {
            successor.doResponsibility(stuff);
        }
    }
}
