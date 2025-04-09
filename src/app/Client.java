package app;

public class Client {
    public static void run(){
        TransportFactory carFactory = new CarFactory();
        Transport tesla = carFactory.createTransport();
        tesla.move();

        TransportFactory planeFactory = new PlaneFactory();
        Transport boeing737 = planeFactory.createTransport();
        boeing737.move();

    }
}
