public class StringConcatenation {
    public static void main(String[] args) {
        // Anything that we put in double quotes is a string

//        String c ="a";
//        String i = "1";
//        String j = "2";
//        System.out.println(i+j);


        String x = "hello";
        String y = "world";

        int a = 100;
        int b = 200;

        String s1 = "100";
        String s2 = "200";

        System.out.println(a + b);//300
        System.out.println(s1 + s2);//100200

        System.out.println("=========================================");
        System.out.println(x);//hello
        System.out.println(y);//world

        System.out.println(x + y);//hello + world => helloworld
        System.out.println(a + b);// 100+200 ==> 300

        System.out.println(x + a);// hello + 100 ==> hello100
        System.out.println(a + b + x + y); //300helloworld
        System.out.println(x + y + a + b); //helloWorld100200
        System.out.println(a + b + x + y + a + b);//300helloworld100200
        System.out.println(a + b + s1 + s2); //"300100200"

        System.out.println(x+a*b); //hello20000
        System.out.println(x+b/a); //hello2
        //System.out.println((x+b)/a); //CTE


    }
}
