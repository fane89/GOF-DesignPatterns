package pl.fane.gof.behavioural.iterator;

import pl.fane.gof.behavioural.iterator.model.AbstractIterator;
import pl.fane.gof.behavioural.iterator.model.ConcreteAggregate;

public class IteratorMain {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate("a", "b", "c");
        AbstractIterator iterator = concreteAggregate.createIterator();

        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }

    }
}
