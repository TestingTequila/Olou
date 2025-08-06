package day16;

public class MethodsWithReturnTypeAndWithoutParameter
{
    int x; //global variables or class level variables
    int y; //global variables or class level variables

    public void addition1() {
        int sum = x + y;
        System.out.println("Addition of " + x + " and " + y + " is : " + sum);
    }

    public int addition2() {
        int sum = x + y;
        System.out.println("Addition of " + x + " and " + y + " is : " + sum);
        return sum;
    }


}
