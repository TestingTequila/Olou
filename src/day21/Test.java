package day21;

public class Test {
    static int a = 10;
    int b = 20;

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        System.out.println(t1.a++); //10
        System.out.println(t1.b++); //20
        System.out.println(t2.a++); //11
        System.out.println(t2.b++); //20
        System.out.println(t1.b);   //21
        System.out.println(t2.b);   //21
    }
}
