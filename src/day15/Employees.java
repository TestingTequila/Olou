package day15;

public class Employees {
    String fName;
    String lName;


    public void printFullName() {
        String completeName = fName + " " + lName;
        System.out.println("My Full Name is: " + completeName);
    }

    double basicSalary;
    double travelAllowance;

    public void calculateSalary() {
        double totalSalary = basicSalary + travelAllowance;
        System.out.println("The salary of the Employee is $" + totalSalary);
    }

}
