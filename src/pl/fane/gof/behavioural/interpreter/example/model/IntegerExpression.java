package pl.fane.gof.behavioural.interpreter.example.model;

public class IntegerExpression extends AbstractExpression {

    private int value;

    public IntegerExpression(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
