package day20;

public class Car {
    String name; //non-static or instance variable
    double price; //non-static or instance variable
    String color; //non-static or instance variable
    static int wheels = 4; //static variable

    public String start() {
        String message = "Car start...non-static";
        return message;
    }

    public static String stop() {
        //static int x=7; Local variable can't be static
        Car car = new Car();
        car.start();
        String message = "Car stop...static";
        return message;
    }

    public static String autoParking() {
        stop();
        Car.stop();
        String message = "This is static auto-parking";
        wheels=5;
        return message;

    }

    public String refuel() {
        start();
        Car car = new Car();
        car.start();
        Car.autoParking();
        String message = "This is non-static refuel";
        return message;
    }
}
