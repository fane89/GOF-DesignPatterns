package pl.fane.gof.behavioural.iterator.model;

public abstract class AbstractIterator<T> {
    public abstract T first();

    public abstract T next();

    public abstract T currentItem();

    public abstract boolean isDone();
}
