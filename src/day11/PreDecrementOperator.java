package day11;

public class PreDecrementOperator
{
    public static void main(String[] args) {

        System.out.println("======pre decrement Operator========");
        int a =1;
        int b =--a; // it will increment the value of the variable with ++ sign by 1
                    // and then it will assign the value of variable to other variable

        System.out.println(a);//0
        System.out.println(b);//0

        int c =99;
        int d = --c;
        System.out.println(c);//98
        System.out.println(d);//98

        int c1 =-99;
        int d1 = --c1;
        System.out.println(c1);//-100
        System.out.println(d1);//-100


        int x =10;
        int y = --x;
        System.out.println(x);//9
        System.out.println(y);//9

        char ch1 = 'a';
        char ch2 = --ch1;
        System.out.println(ch1);//'
        System.out.println(ch2);//'


        System.out.println("======pre Decrement Operator========");


    }
}
