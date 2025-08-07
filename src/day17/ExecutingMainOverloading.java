package day17;

public class ExecutingMainOverloading {
    public static void main(String[] args) {

        String[] names = {"Jason", "Lee", "Rohan", "Ben", "Kerrie"};
        MainOverloading.main(names);
        MainOverloading.main("Java");
        MainOverloading.main("Java", 5);
        MainOverloading.main(names, 'M');
    }
}
