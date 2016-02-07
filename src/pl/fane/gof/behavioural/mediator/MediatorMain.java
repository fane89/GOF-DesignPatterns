package pl.fane.gof.behavioural.mediator;

import pl.fane.gof.behavioural.mediator.model.AbstractMediator;
import pl.fane.gof.behavioural.mediator.model.ColleagueA;
import pl.fane.gof.behavioural.mediator.model.ColleagueB;
import pl.fane.gof.behavioural.mediator.model.ConcreteMediator;

public class MediatorMain {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ColleagueA colleagueA = new ColleagueA(concreteMediator);
        ColleagueB colleagueB = new ColleagueB(concreteMediator);

        concreteMediator.setColleagueA(colleagueA);
        concreteMediator.setColleagueB(colleagueB);

        colleagueA.send();
        colleagueB.send();
    }
}
