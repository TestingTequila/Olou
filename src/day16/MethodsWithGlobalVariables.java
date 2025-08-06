package day16;

public class MethodsWithGlobalVariables
{
    int x; //global variables or class level variables
    int y; //global variables or class level variables

    public void addition() {
        int sum = x + y;
        System.out.println("Addition of " + x + " and " + y + " is : " + sum);
    }

    public void subtraction() {
        int diff = x - y;
        System.out.println("Subtraction of " + x + " and " + y + " is : " + diff);

    }

    private void multiplication() {
        int product = x * y;
        System.out.println("Multiplication of " + x + " and " + y + " is : " + product);
    }
}
