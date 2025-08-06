package day16;

public class MethodsWithReturnTypeAndWithParameter
{


    public void addition1(int x, int y) {
        int sum = x + y;
        System.out.println("Addition of " + x + " and " + y + " is : " + sum);
    }

    public int addition2(int x, int y) {
        int sum = x + y;
        System.out.println("Addition of " + x + " and " + y + " is : " + sum);
        return sum;
    }


}
