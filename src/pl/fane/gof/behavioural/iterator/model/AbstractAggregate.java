package pl.fane.gof.behavioural.iterator.model;

public abstract class AbstractAggregate<T> {
    public abstract AbstractIterator createIterator();

    public abstract int count();

    public abstract T get(int index);
}
