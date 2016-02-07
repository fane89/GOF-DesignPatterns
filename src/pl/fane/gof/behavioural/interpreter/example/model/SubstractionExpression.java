package pl.fane.gof.behavioural.interpreter.example.model;

public class SubstractionExpression extends AbstractExpression {

    private AbstractExpression abstractExpression0;
    private AbstractExpression abstractExpression1;

    public SubstractionExpression(AbstractExpression abstractExpression0, AbstractExpression abstractExpression1) {
        this.abstractExpression0 = abstractExpression0;
        this.abstractExpression1 = abstractExpression1;
    }

    @Override
    public int evaluate() {
        int eval0 = abstractExpression0.evaluate();
        int eval1 = abstractExpression1.evaluate();
        return eval0 - eval1;
    }

    @Override
    public String toString() {
        return abstractExpression0 + " - " + abstractExpression1;
    }
}
