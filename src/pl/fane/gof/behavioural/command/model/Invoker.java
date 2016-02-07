package pl.fane.gof.behavioural.command.model;

public class Invoker {

    AbstractCommand command;

    public AbstractCommand getCommand() {
        return command;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
