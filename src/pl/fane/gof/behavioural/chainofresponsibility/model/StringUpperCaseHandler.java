package pl.fane.gof.behavioural.chainofresponsibility.model;

public class StringUpperCaseHandler extends AbstractHandler {
    @Override
    public void doResponsibility(String stuff) {
        String upperCase = stuff.toUpperCase();
        System.out.println(upperCase);
        if (successor != null) {
            successor.doResponsibility(upperCase);
        }
    }
}
