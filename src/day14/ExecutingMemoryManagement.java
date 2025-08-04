package day14;

public class ExecutingMemoryManagement {
    public static void main(String[] args) {
        MemoryManagement user1 = new MemoryManagement();
        user1.fName = "Kerrie";
        user1.lName = "Wright";
        user1.age = 27;
        user1.salary = 3456.87;

        System.out.println("First Name: " + user1.fName + ", Last Name: " + user1.lName + ", Age: " + user1.age + ", Salary: " + user1.salary);

        MemoryManagement user2 = new MemoryManagement();
        user2.fName = "Johnson";
        user2.lName = "Dakota";
        user2.age = 45;
        user2.salary = 3435.56;

        System.out.println("First Name: " + user2.fName + ", Last Name: " + user2.lName + ", Age: " + user2.age + ", Salary: " + user2.salary);

        MemoryManagement user3 = new MemoryManagement();
        user3.fName = "Rose";
        user3.lName = "Mary";
        user3.age = 34;
        user3.salary = 5677.76;

        System.out.println("First Name: " + user3.fName + ", Last Name: " + user3.lName + ", Age: " + user3.age + ", Salary: " + user3.salary);

        System.out.println("Case 1: Reference variable pointing towards null......");
        //user1 = null;
        //System.out.println("First Name: " + user1.fName + ", Last Name: " + user1.lName + ", Age: " + user1.age + ", Salary: " + user1.salary);

        System.out.println("Case 1: Object without reference Variable......");

        new MemoryManagement().fName = "Ben";
        new MemoryManagement().lName = "Fletcher";
        new MemoryManagement().age =37;
        new MemoryManagement().salary =4567.65;

        System.gc();


    }
}
