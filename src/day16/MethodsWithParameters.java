package day16;

public class MethodsWithParameters
{

    public void addition(int x, int y) {
        int sum = x + y;
        System.out.println("Addition of " + x + " and " + y + " is : " + sum);
    }

    public void subtraction(int x , int y) {
        int diff = x - y;
        System.out.println("Subtraction of " + x + " and " + y + " is : " + diff);

    }

    private void multiplication(int x, int y) {
        int product = x * y;
        System.out.println("Multiplication of " + x + " and " + y + " is : " + product);
    }
}
