package pl.fane.gof.behavioural.observer;

import pl.fane.gof.behavioural.observer.model.ConcreteObserver;
import pl.fane.gof.behavioural.observer.model.ConcreteSubject;

public class ObserverMain {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        ConcreteObserver concreteObserver = new ConcreteObserver(concreteSubject);
        ConcreteObserver concreteObserver1 = new ConcreteObserver(concreteSubject);

        concreteSubject.attach(concreteObserver);
        concreteSubject.attach(concreteObserver1);
        concreteSubject.setState("1");
        concreteSubject.notifyAllObservers();
        concreteSubject.setState("2");
        concreteSubject.notifyAllObservers();
        concreteSubject.detach(concreteObserver1);
        concreteSubject.notifyAllObservers();
    }
}
