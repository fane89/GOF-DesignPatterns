package pl.fane.gof.behavioural.command;

import pl.fane.gof.behavioural.command.model.ConcreteCommand;
import pl.fane.gof.behavioural.command.model.Invoker;
import pl.fane.gof.behavioural.command.model.ConcreteReceiver;

public class CommandMain {
    public static void main(String[] args) {
        ConcreteReceiver concreteReceiver = new ConcreteReceiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(concreteReceiver);
        concreteCommand.setParameter("Hello from gof example.");

        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);
        invoker.executeCommand();
    }
}
