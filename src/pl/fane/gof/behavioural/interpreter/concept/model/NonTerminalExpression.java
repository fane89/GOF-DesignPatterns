package pl.fane.gof.behavioural.interpreter.concept.model;

public class NonTerminalExpression extends AbstractExpression {

    private AbstractExpression abstractExpression0;
    private AbstractExpression abstractExpression1;

    public void setAbstractExpression0(AbstractExpression abstractExpression0) {
        this.abstractExpression0 = abstractExpression0;
    }

    public void setAbstractExpression1(AbstractExpression abstractExpression1) {
        this.abstractExpression1 = abstractExpression1;
    }

    @Override
    public void interpret(Context context) {
        System.out.println("NonTerminal for " + context);
        abstractExpression0.interpret(context);
        abstractExpression1.interpret(context);
    }
}
