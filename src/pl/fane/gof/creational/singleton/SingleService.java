package pl.fane.gof.creational.singleton;

public enum SingleService {
    INSTANCE;

    public void doServiceStuff(){
        System.out.println(INSTANCE.getClass() + " doing service stuff");
    }
}
