package pl.fane.gof.behavioural.memento.model;

public class Persistence {
    public Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
