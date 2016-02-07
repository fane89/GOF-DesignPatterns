package pl.fane.gof.behavioural.command.model;

public class ConcreteReceiver extends AbstractReceiver {

    @Override
    public void Action(String msg) {
        System.out.println(msg);
        System.out.println("Received in " + this.getClass());
    }
}
