package day11;

public class PrePostIDWithSOut
{
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num++);//10
        System.out.println(num);  //11


        int x = -99;
        System.out.println(--x);//-100
        System.out.println(x); //-100

        char ch = 'a';
        System.out.println(ch++);//a
        System.out.println(ch);//b

        char cc = 'a';
        System.out.println(++cc); //b
        System.out.println(cc);  //b

        byte f1 = 127;
        System.out.println(f1++);//127
        System.out.println(f1); //-128

    }
}
