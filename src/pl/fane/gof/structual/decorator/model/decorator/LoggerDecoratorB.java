package pl.fane.gof.structual.decorator.model.decorator;

import pl.fane.gof.structual.decorator.model.log.Logger;

public class LoggerDecoratorB extends LoggerDecorator {

    public LoggerDecoratorB(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        super.log(msg);
        System.out.println("BBB " + msg);
    }
}
