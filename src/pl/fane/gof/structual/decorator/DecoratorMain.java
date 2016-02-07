package pl.fane.gof.structual.decorator;

import pl.fane.gof.structual.decorator.model.decorator.LoggerDecorator;
import pl.fane.gof.structual.decorator.model.decorator.LoggerDecoratorA;
import pl.fane.gof.structual.decorator.model.log.LoggerImpl;
import pl.fane.gof.structual.decorator.model.decorator.LoggerDecoratorB;
import pl.fane.gof.structual.decorator.model.log.Logger;

public class DecoratorMain {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl();
        LoggerDecorator loggerDecorator = new LoggerDecoratorB(new LoggerDecoratorA(logger));
        loggerDecorator.log("TEST");
    }
}
