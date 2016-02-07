package pl.fane.gof.behavioural.memento;

import pl.fane.gof.behavioural.memento.model.Memento;
import pl.fane.gof.behavioural.memento.model.Originator;
import pl.fane.gof.behavioural.memento.model.Persistence;

public class MementoMain {
    public static void main(String[] args) {
        Originator o1 = new Originator("initial state");

        Memento memento = o1.createMemento();

        Persistence persistence = new Persistence();
        persistence.setMemento(memento);

        Originator o2 = new Originator("123");
        o2.setMemento(persistence.getMemento());

        System.out.println(o1 + " " + o2);
    }
}
