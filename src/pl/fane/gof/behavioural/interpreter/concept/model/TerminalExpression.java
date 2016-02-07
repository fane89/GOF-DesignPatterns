package pl.fane.gof.behavioural.interpreter.concept.model;

public class TerminalExpression extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("Terminal for " + context);
    }
}
