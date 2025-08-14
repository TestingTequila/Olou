package day23;

public class Company {
    private String empName;
    private double empSalary;

    public Company(String empName, double empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public String getEmpName()
    {
        String empMsg= null;
        if(empName.equals("Margret") ||empName.equals("Rose"))
        {
            empMsg = "Not an Employee of this Company";
        }
        else {
            empMsg= empName;
        }
        return empMsg;
    }

    public double getEmpSalary()
    {
         double salary;
        if(empSalary>10000)
        {
            salary = 0;
        }
        else
        {
            salary = empSalary;
        }
        return salary;
    }


}
