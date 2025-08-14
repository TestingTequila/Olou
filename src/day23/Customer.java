package day23;

public class Customer {
    String name;
    int age;

    public Customer() {
        System.out.println("This is default Constructor");
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
