package pl.fane.gof.structual.proxy;

import pl.fane.gof.structual.proxy.model.ProxySubject;

public class ProxyMain {
    public static void main(String[] args) {

        ProxySubject proxySubject = new ProxySubject();
        proxySubject.doOperation();
        proxySubject.doOperation();
        proxySubject.doOperation();
        proxySubject.doOperation();

        System.out.printf(String.valueOf(proxySubject.getOperationCount()));

    }
}
