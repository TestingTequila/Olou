package day13;

public class ExecutingCollege {
    public static void main(String[] args) {

        System.out.println("===========================c1=========================");
        College c1 = new College();
        c1.collegeName = "St. Joseph University";
        c1.HODName = "J.M Roger";
        c1.countOfStudents = 1500;
        c1.offersPlacement = true;
        System.out.println("College Name: " + c1.collegeName + ", HOD Name: " + c1.HODName + ", Count Of Students: " + c1.countOfStudents + ", Offers Placement: " + c1.offersPlacement);


        System.out.println("===========================c2=========================");
        College c2 = new College();
        c2.collegeName = "St. Patrik's University";
        c2.HODName = "R. Raman";
        c2.countOfStudents = 2300;
        c2.offersPlacement = true;
        System.out.println("College Name: " + c2.collegeName + ", HOD Name: " + c2.HODName + ", Count Of Students: " + c2.countOfStudents + ", Offers Placement: " + c2.offersPlacement);


        System.out.println("===========================c3=========================");
        College c3 = new College();
        c3.collegeName = "Oxford University";
        c3.HODName = "Lindsay Rodham";
        c3.countOfStudents = 5000;
        c3.offersPlacement = false;
        System.out.println("College Name: " + c3.collegeName + ", HOD Name: " + c3.HODName + ", Count Of Students: " + c3.countOfStudents + ", Offers Placement: " + c3.offersPlacement);

    }
}
