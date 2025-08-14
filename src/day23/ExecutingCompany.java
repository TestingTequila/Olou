package day23;

public class ExecutingCompany
{
    public static void main(String[] args) {
        Company company=new Company("Margret", 15567.89);
        //System.out.print(company.getEmpName()+"\n" + company.getEmpSalary());
        System.out.println(company.getEmpName());
        System.out.println(company.getEmpSalary());
    }
}
