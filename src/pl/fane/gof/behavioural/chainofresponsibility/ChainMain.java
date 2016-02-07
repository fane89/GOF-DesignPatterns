package pl.fane.gof.behavioural.chainofresponsibility;

import pl.fane.gof.behavioural.chainofresponsibility.model.StringPrinter;
import pl.fane.gof.behavioural.chainofresponsibility.model.StringReverser;
import pl.fane.gof.behavioural.chainofresponsibility.model.StringUpperCaseHandler;

public class ChainMain {
    public static void main(String[] args) {

        StringPrinter stringPrinter = new StringPrinter();
        StringUpperCaseHandler stringUpperCaseHandler = new StringUpperCaseHandler();
        StringReverser stringReverser = new StringReverser();
        StringPrinter lastStringPrinter = new StringPrinter();

        stringPrinter.setSuccessor(stringReverser);
        stringReverser.setSuccessor(stringUpperCaseHandler);
        stringUpperCaseHandler.setSuccessor(lastStringPrinter);

        stringPrinter.doResponsibility("Hello Dev!");
    }
}
