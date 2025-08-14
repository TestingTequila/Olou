package day19;

public class MathOperations {
    public static void main(String[] args) {

        System.out.println("===================I/I = I part===================");
        System.out.println(10 / 2); //5
        System.out.println(10 / 3); // 3
        System.out.println(11 / 2); // 5

        System.out.println("=================I/D or D/I = I+D part");
        System.out.println(10.0 / 2); //5.0
        System.out.println(10 / 3.0); //3.333333
        System.out.println(11.0 / 2.0); //5.5

        int a = 10;
        int b = 2;
        int c = 3;
        double sum = a/c;
        System.out.println(sum);//3.0

        System.out.println("==================Modulo Operator================");
        System.out.println(10%2); //0
        System.out.println(10%3); //1
        System.out.println(10.0%3); //1.0
        System.out.println(9.2%2); //
    }
}
