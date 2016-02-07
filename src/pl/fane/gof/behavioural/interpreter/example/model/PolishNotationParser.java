package pl.fane.gof.behavioural.interpreter.example.model;

import java.util.ArrayList;
import java.util.List;

public class PolishNotationParser {

    public AbstractExpression parse(String notation) {
        List<String> symbols = new ArrayList<String>();
        String[] strings = notation.split(" ");
        for (String string : strings) {
            symbols.add(string);
        }
        return parseNextExpression(symbols);
    }

    private AbstractExpression parseNextExpression(List<String> symbols) {
        try {
            int value = Integer.parseInt(symbols.get(0));
            symbols.remove(0);
            return new IntegerExpression(value);
        } catch (NumberFormatException ex) {
            return parseNonTerminalExpression(symbols);
        }
    }

    private AbstractExpression parseNonTerminalExpression(List<String> symbols) {
        String symbol = symbols.get(0);
        symbols.remove(0);

        AbstractExpression a1 = parseNextExpression(symbols);
        AbstractExpression a2 = parseNextExpression(symbols);

        switch (symbol) {
            case "+":
                return new AdditionExpression(a1, a2);
            case "-":
                return new SubstractionExpression(a1, a2);
            default:
                throw new IllegalArgumentException();
        }
    }
}
