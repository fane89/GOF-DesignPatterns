package pl.fane.gof.behavioural.visitor.model;

public class ConcreteElementA extends AbstractElement {
    @Override
    public void accept(AbstractVisitor abstractVisitor) {
        abstractVisitor.visit(this);
    }
}
