package pl.fane.gof.structual.proxy.model;

public class ProxySubject extends AbstractSubject {

    RealSubject realSubject = new RealSubject();

    private int operationCount = 0;

    @Override
    public void doOperation() {
        //Here:
        // Caching proxy
        // Smart proxy
        // Remote proxy
        // Protection proxy with small adjustments to auth

        //Smart
        operationCount++;
        realSubject.doOperation();
    }

    public int getOperationCount() {
        return operationCount;
    }
}
