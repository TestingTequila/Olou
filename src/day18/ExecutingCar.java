package day18;

public class ExecutingCar {
    public static void main(String[] args) {

        System.out.println("================Car1==========================");
        Car car1 = new Car();
        car1.name = "BMW";
        car1.price = 6867876;
        car1.color = "Black";
        System.out.println("Car Name: " + car1.name + ", CarPrice: $" + car1.price + ", Car Color: " + car1.color + ", Car Wheels Count: " +Car.wheels+ "Car Start: " + car1.start()+ "Car Stop: " + Car.stop());

        System.out.println("================Car2==========================");

        Car car2 = new Car();
        car2.name = "Audi";
        car2.price = 6757567;
        car2.color = "Red";

        System.out.println("Car Name: " + car2.name + ", CarPrice: $" + car2.price + ", Car Color: " + car2.color + ", Car Wheels Count: " +Car.wheels + "Car Start: " + car2.start() + "Car Stop: " + Car.stop());


        System.out.println("================Car3==========================");

        Car car3 = new Car();
        car3.name = "Tesla";
        car3.price = 6757675;
        car3.color = "Grey";
        System.out.println("Car Name: " + car3.name + ", CarPrice: $" + car3.price + ", Car Color: " + car3.color + ", Car Wheels Count: " +Car.wheels+ "Car Start: " + car3.start()+ "Car Stop: " + Car.stop());


    }
}
