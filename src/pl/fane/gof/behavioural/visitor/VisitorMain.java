package pl.fane.gof.behavioural.visitor;

import pl.fane.gof.behavioural.visitor.model.AbstractElement;
import pl.fane.gof.behavioural.visitor.model.ConcreteElementA;
import pl.fane.gof.behavioural.visitor.model.ConcreteVisitorA;
import pl.fane.gof.behavioural.visitor.model.ObjectStructure;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();

        List<AbstractElement> elementList = new ArrayList<>();
        elementList.add(new ConcreteElementA());
        elementList.add(new ConcreteElementA());
        elementList.add(new ConcreteElementA());
        elementList.add(new ConcreteElementA());

        objectStructure.setElements(elementList);

        objectStructure.accept(new ConcreteVisitorA());
    }
}
