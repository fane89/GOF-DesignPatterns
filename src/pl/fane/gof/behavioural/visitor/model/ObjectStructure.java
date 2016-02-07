package pl.fane.gof.behavioural.visitor.model;

import java.util.List;

public class ObjectStructure {

    private List<AbstractElement> elements;

    public List<AbstractElement> getElements() {
        return elements;
    }

    public void setElements(List<AbstractElement> elements) {
        this.elements = elements;
    }

    public void accept(AbstractVisitor abstractVisitor) {
        for (AbstractElement element : elements) {
            element.accept(abstractVisitor);
        }
    }
}
