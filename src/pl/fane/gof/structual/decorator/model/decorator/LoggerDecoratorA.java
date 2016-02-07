package pl.fane.gof.structual.decorator.model.decorator;

import pl.fane.gof.structual.decorator.model.log.Logger;

public class LoggerDecoratorA extends LoggerDecorator {

    public LoggerDecoratorA(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        super.log(msg);
        System.out.println("AAA " + msg);
    }
}
