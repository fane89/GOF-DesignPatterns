package pl.fane.gof.behavioural.interpreter.concept;

import pl.fane.gof.behavioural.interpreter.concept.model.Context;
import pl.fane.gof.behavioural.interpreter.concept.model.NonTerminalExpression;
import pl.fane.gof.behavioural.interpreter.concept.model.TerminalExpression;

public class InterpreterMain {

    public static void main(String[] args) {
        TerminalExpression t1 = new TerminalExpression();
        TerminalExpression t2 = new TerminalExpression();
        TerminalExpression t3 = new TerminalExpression();

        NonTerminalExpression nt1 = new NonTerminalExpression();
        NonTerminalExpression nt2 = new NonTerminalExpression();

        nt1.setAbstractExpression0(t1);
        nt1.setAbstractExpression1(nt2);

        nt2.setAbstractExpression0(t2);
        nt2.setAbstractExpression1(t3);

        Context context = new Context("Hello again");
        nt1.interpret(context);
    }
}
