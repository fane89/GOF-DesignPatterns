package pl.fane.gof.behavioural.command.model;

public abstract class AbstractCommand {

    protected AbstractReceiver receiver;

    public AbstractCommand(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
