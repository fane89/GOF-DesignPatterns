package pl.fane.gof.behavioural.command.model;

public class ConcreteCommand extends AbstractCommand {

    public ConcreteCommand(AbstractReceiver receiver) {
        super(receiver);
    }

    private String parameter;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void execute() {
        receiver.Action(parameter + this.getClass());
    }
}
