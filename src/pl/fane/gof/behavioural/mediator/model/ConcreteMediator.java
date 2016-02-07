package pl.fane.gof.behavioural.mediator.model;

public class ConcreteMediator extends AbstractMediator {

    private ColleagueA colleagueA;
    private ColleagueB colleagueB;

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void sendMessage(AbstractColleague abstractColleague) {
        if (abstractColleague.equals(colleagueA))
            colleagueB.receive();
        else
            colleagueA.receive();
    }
}
