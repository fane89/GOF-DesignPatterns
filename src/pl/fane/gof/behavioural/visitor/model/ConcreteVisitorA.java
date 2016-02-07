package pl.fane.gof.behavioural.visitor.model;

public class ConcreteVisitorA extends AbstractVisitor {
    @Override
    public void visit(AbstractElement element) {
        System.out.println("Visitor A visiting " + element);
    }
}
