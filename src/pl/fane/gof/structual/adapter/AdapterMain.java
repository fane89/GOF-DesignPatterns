package pl.fane.gof.structual.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        service.serviceMe();
    }
}
