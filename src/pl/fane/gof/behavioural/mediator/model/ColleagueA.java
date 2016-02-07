package pl.fane.gof.behavioural.mediator.model;

public class ColleagueA extends AbstractColleague {
    public ColleagueA(AbstractMediator mediator) {
        super(mediator);
    }

    public void send() {
        System.out.println("ColleagueA sent msg");
        mediator.sendMessage(this);
    }

    public void receive() {
        System.out.println("ColleagueA received msg");
    }
}
