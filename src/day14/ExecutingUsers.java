package day14;

public class ExecutingUsers {
    public static void main(String[] args) {
        Users u1 = new Users();
        u1.fName = "Jason";
        u1.age = 23;
        u1.city = "NY";

        Users u2 = new Users();
        u2.fName = "Ben";
        u2.age = 43;
        u2.city = "Ohio";

        Users u3 = new Users();
        u3.fName = "Kerrie";
        u3.age = 27;
        u3.city = "NJ";

        System.out.println("First Name: " + u1.fName + ", Age: " + u1.age + ", Salary: " + u1.city);
        System.out.println("First Name: " + u2.fName + ", Age: " + u2.age + ", Salary: " + u2.city);
        System.out.println("First Name: " + u3.fName + ", Age: " + u3.age + ", Salary: " + u3.city);

        System.out.println("======> u1 =u2 <=====================");
        u1 = u2;

        System.out.println("First Name: " + u1.fName + ", Age: " + u1.age + ", Salary: " + u1.city);
        System.out.println("First Name: " + u2.fName + ", Age: " + u2.age + ", Salary: " + u2.city);
        System.out.println("First Name: " + u3.fName + ", Age: " + u3.age + ", Salary: " + u3.city);

        System.out.println("======> u2 =u3 <=====================");
        u2 =u3;
        System.out.println("First Name: " + u1.fName + ", Age: " + u1.age + ", Salary: " + u1.city);
        System.out.println("First Name: " + u2.fName + ", Age: " + u2.age + ", Salary: " + u2.city);
        System.out.println("First Name: " + u3.fName + ", Age: " + u3.age + ", Salary: " + u3.city);

        System.out.println("======> u3 =u1 <=====================");
        u3 =u1;
        System.out.println("First Name: " + u1.fName + ", Age: " + u1.age + ", Salary: " + u1.city);
        System.out.println("First Name: " + u2.fName + ", Age: " + u2.age + ", Salary: " + u2.city);
        System.out.println("First Name: " + u3.fName + ", Age: " + u3.age + ", Salary: " + u3.city);

        System.out.println("======> u1=u2=u3 <=====================");
        u1=u2=u3;
        System.out.println("First Name: " + u1.fName + ", Age: " + u1.age + ", Salary: " + u1.city);
        System.out.println("First Name: " + u2.fName + ", Age: " + u2.age + ", Salary: " + u2.city);
        System.out.println("First Name: " + u3.fName + ", Age: " + u3.age + ", Salary: " + u3.city);
    }
}
