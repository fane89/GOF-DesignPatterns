package pl.fane.gof.behavioural.visitor.model;

public abstract class AbstractElement {

    public abstract void accept(AbstractVisitor abstractVisitor);

}
