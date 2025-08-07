package day17;

import java.util.Arrays;

public class MainOverloading {
    public static void main(String[] args) {
        System.out.println("This is default main method...." + Arrays.toString(args));
    }

    public static void main(String args) {
        System.out.println("This is main method with String parameter...." + args);

    }

    public static void main(String args, int a) {
        System.out.println("This is main method with String and integer parameter...." + args + " and " + a);
    }

    public static void main(String[] args, char c) {
        System.out.println("This is main method with String[] and char parameter...." + Arrays.toString(args) + " and " + c);
    }
}
