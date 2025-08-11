package day18;

public class Car {
    String name;
    double price;
    String color;
    static int wheels=4;

    public  String start()
    {
        String message = "Car start...non-static";
        return message;
    }

    public static String stop() {
        String message = "Car stop...static";
        return message;
    }

    public static String autoParking()
    {
        String message = "This is static auto-parking";
        return message;
    }

    public String refuel()
    {
        String message = "This is non-static refuel";
        return message;
    }
}
