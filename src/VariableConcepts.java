public class VariableConcepts {
    public static void main(String[] args) {

        //I want to store the number 10  [Integer(byte, short, int, long), Decimal(float, double), Single Character(char), T/F(boolean)]
        byte x = 10;//1 byte or 8 bits [-128 to 127]
        System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);

        short y = 10;   //2 byte  = 16 bits, -32768 to 32767
        System.out.println("Short.MIN_VALUE: " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE: " + Short.MAX_VALUE);

        int z = 32768; //4 byte = 32 bits [-2147483648 to 2147483647]
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);

        long a = 2147483648L; //8 byte or 64 bits [-9223372036854775808 to -9223372036854775807]
        System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
        System.out.println(a);//2147483648

        //1. memory consumption
        //2. Range of data type
        //2. How we are to use the value

        //what are data types


        // How to pick the right data type
        // WAP to print addition of two integer numbers 10, 8

        int a1 = 129; //1 byte
        int a2 = 83;  //1 byte

        int sum = a1 + a2; //20

        short age = 30;

        System.out.println("=================Decimal Number==========================");
        //1. float [4 byte = 32 bits] [precision is up to 6-7 decimal places]
        //2. double [8 byte = 64 bits [precision level of 15-16 decimal places]

        float f1 = 12.12345678987654321F;
        System.out.println("float: " + f1);
        float f2 = (float) 12.12345678987654321;

        double d1 = 12.12345678987654321;
        System.out.println("double: " + d1);

        System.out.println("=========================Char data type=====================");
        //char [2 byte] [a-z, A-Z, 1-9, !@#$%^&*()_+]
        char c1 = 'a';
        char c2 = 'b';
        //char c3 = 1; we will look into this
        char c4 = '$';
        char c5 = '1';
        char c6 = '=';
        System.out.println(c1);//a
        System.out.println(c2);//b
        //System.out.println(c3);//
        System.out.println(c4);//$
        System.out.println(c5);//1

        System.out.println(c1+c2);//195

        char r1 = '0';
        char r2 = '9';
        System.out.println(r1); //0
        System.out.println(r2); //9
        System.out.println(r1+r2);//105

        System.out.println((int)r1);//48
        System.out.println((char)48);//0

       char u1  ='a';
       char u2 = 'b';
        System.out.println((int)u1);//97
        System.out.println((int)u2);//98
        System.out.println(u1);//a
        System.out.println(u2);//b
        System.out.println((int)'a');
        System.out.println((int)'b');
        System.out.println((char)97);//a
        System.out.println((char)98);//b
        System.out.println(u1+0);//97
        System.out.println(u1+'0');//97+48 =145

        char cc = 1;//
        System.out.println(cc);


        System.out.println("====================boolean data type=====");
        //boolean [true, false] ~1 bit
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);//true
        System.out.println(b2);//false



    }
}
