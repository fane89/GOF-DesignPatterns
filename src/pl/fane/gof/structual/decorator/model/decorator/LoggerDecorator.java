package pl.fane.gof.structual.decorator.model.decorator;

import pl.fane.gof.structual.decorator.model.log.Logger;

public class LoggerDecorator implements Logger {
    public Logger logger;

    LoggerDecorator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void log(String msg) {
        logger.log(msg);
    }
}
