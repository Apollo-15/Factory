package app;

public class Main {
    public static void main(String[] args) {
        Transport tesla = new Car();
        tesla.move();

        Transport boeing737 = new Plane();
        boeing737.move();

        Client.run();
    }
}