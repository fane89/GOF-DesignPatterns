package pl.fane.gof.behavioural.observer.model;

import java.util.List;

public abstract class AbstractSubject {

    protected List<Observer> observers;

    public abstract void attach(Observer o);

    public abstract void detach(Observer o);

    public abstract void notifyAllObservers();
}
