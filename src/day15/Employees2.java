package day15;

public class Employees2 {
    String fName;
    String lName;

    public void printFullName(String fName, String lName) {
        String completeName = this.fName + " " + this.lName;
        System.out.println("My Full Name is: " + completeName);
    }

    double basicSalary;
    double travelAllowance;

    public void calculateSalary() {
        double totalSalary = basicSalary + travelAllowance;
        System.out.println("The salary of the Employee is $" + totalSalary);
    }

}
