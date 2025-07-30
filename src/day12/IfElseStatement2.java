package day12;

public class IfElseStatement2 {
    public static void main(String[] args) {

        int x = 12;
        int y = 7;
        System.out.println(x);//12
        System.out.println(y);//7

        System.out.println(x > y);//true
        System.out.println(x < y);//false

        System.out.println("============================================");

        int age =17;

        if(age>10)
        {
            System.out.println("The persons age is more than 10 and less than 15");
        }
        if(age>15)
        {
            System.out.println("The person age is more than 15 and less than 20");
        }
        if(age>20)
        {
            System.out.println("The person age is more than 20 and less than 25");
        }
        else
        {
            System.out.println("The person is not eligible to Vote...");
        }



    }
}
