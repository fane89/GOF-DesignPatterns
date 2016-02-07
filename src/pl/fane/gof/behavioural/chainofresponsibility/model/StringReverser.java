package pl.fane.gof.behavioural.chainofresponsibility.model;

public class StringReverser extends AbstractHandler {
    @Override
    public void doResponsibility(String stuff) {
        if (successor != null) {
            successor.doResponsibility(new StringBuilder(stuff).reverse().toString());
        }
    }
}
