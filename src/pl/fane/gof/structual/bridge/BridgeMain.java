package pl.fane.gof.structual.bridge;

import pl.fane.gof.structual.bridge.model.RefinedAbstraction;
import pl.fane.gof.structual.bridge.model.AbstractTop;

public class BridgeMain {
    public static void main(String[] args) {
        AbstractTop abstractTop = new RefinedAbstraction();
        abstractTop.operation();
    }
}
