package pl.fane.gof.behavioural.observer.model;

public class ConcreteObserver implements Observer {

    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        System.out.println(this + " " + concreteSubject.getState());
    }
}
