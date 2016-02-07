package pl.fane.gof.behavioural.mediator.model;

public class ColleagueB extends AbstractColleague {
    public ColleagueB(AbstractMediator mediator) {
        super(mediator);
    }

    public void send() {
        System.out.println("ColleagueB sent msg");
        mediator.sendMessage(this);
    }

    public void receive() {
        System.out.println("ColleagueB received msg");
    }
}
