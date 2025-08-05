package day15;

public class Execution {
    public static void main(String[] args) {
        MethodsConcepts mc = new MethodsConcepts();
        mc.x = 12;
        mc.y = 8;
        mc.addition();
        mc.subtraction();
        //mc.multiplication(); cannot access multiplication method as this is private

        Employees emp1 = new Employees();
        emp1.fName = "Prachi";
        emp1.lName = "Roger";
        emp1.printFullName();

        emp1.basicSalary = 5678.78;
        emp1.travelAllowance = 4325.54;
        emp1.calculateSalary();

        Employees2 emp2 = new Employees2();
        emp2.fName = "Jason";
        emp2.lName = "Roger";
        emp2.printFullName("Tony", "Hill");

    }
}
