package day23;

public class ExecutingCustomers {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("===Before assigning value to variables");
        System.out.println(customer.name); //null
        System.out.println(customer.age);  //0

        System.out.println("===After assigning value to variables");
        customer.name = "Jason";
        customer.age = 24;
        System.out.print(customer.name + "\n" + customer.age);

        System.out.println("===Assigning value to variables using Constructor");

        Customer customer1 = new Customer("Kerrie", 32);
        System.out.print(customer1.name + "\n" + customer1.age);

        College college = new College("St. Joseph University", 600, true, 1942);
        System.out.println();
        System.out.print("College Name: " + college.collegeName + "\nTotal Students Counts: " + college.totalNumberOfStudents + "\nIs Authorized:" + college.isAuthorized + "\nEstablished Year: " + college.establishedYear);

        System.out.println("==============================================");
        //ECommerce eCommerce= new ECommerce(); Object cannot be created as Constructor is private
        ECommerce.m1();
        ECommerce.m2();
        ECommerce.m3();
    }
}
