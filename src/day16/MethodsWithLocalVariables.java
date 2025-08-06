package day16;

public class MethodsWithLocalVariables
{

    public void addition() {
        int x=12;
        int y=8;
        int sum = x + y;
        System.out.println("Addition of " + x + " and " + y + " is : " + sum);
    }

    public void subtraction() {
        int x=34;
        int y=6;
        int diff = x - y;
        System.out.println("Subtraction of " + x + " and " + y + " is : " + diff);

    }

    private void multiplication() {
        int x=13;
        int y =5;
        int product = x * y;
        System.out.println("Multiplication of " + x + " and " + y + " is : " + product);
    }
}
