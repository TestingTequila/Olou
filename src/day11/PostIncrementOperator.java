package day11;

public class PostIncrementOperator
{
    public static void main(String[] args) {

        System.out.println("======post increment Operator========");
        int a =1;
        int b =a++;// it will assign the value of variable to other variable
                   // it will also increment the value of the variable with ++ sign by 1
        System.out.println(a);//2
        System.out.println(b);//1

        int c =99;
        int d = c++;
        System.out.println(c);//100
        System.out.println(d);//99

        int c1 =-99;
        int d1 = c1++;
        System.out.println(c1);//-98
        System.out.println(d1);//-99


        int x =10;
        int y = x++;
        System.out.println(x);//11
        System.out.println(y);//10

        char ch1 = 'a';
        char ch2 = ch1++;
        System.out.println(ch1);//b
        System.out.println(ch2);//a


        System.out.println("======post Decrement Operator========");


    }
}
