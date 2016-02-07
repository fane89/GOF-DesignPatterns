package pl.fane.gof.behavioural.interpreter.example;

import com.sun.javafx.binding.StringFormatter;
import pl.fane.gof.behavioural.interpreter.example.model.AbstractExpression;
import pl.fane.gof.behavioural.interpreter.example.model.PolishNotationParser;

public class InterpreterExampleMain {
    public static void main(String[] args) {
        String[] commands = {
                "+ 5 6",
                "- 6 5",
                "+ - 4 5 6",
                "+ 4 - 5 6",
                "+ - + - - 2 3 4 + - -5 6 + -7 8 9 10"};

        PolishNotationParser polishNotationParser = new PolishNotationParser();

        for (String command : commands) {
            AbstractExpression expression = polishNotationParser.parse(command);
            System.out.println(expression + " = " + expression.evaluate());
        }
    }
}
