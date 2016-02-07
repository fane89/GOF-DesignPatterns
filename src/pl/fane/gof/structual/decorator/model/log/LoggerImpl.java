package pl.fane.gof.structual.decorator.model.log;

public class LoggerImpl implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("LoggerImpl: " + msg);
    }
}
