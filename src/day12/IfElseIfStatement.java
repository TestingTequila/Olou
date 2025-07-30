package day12;

public class IfElseIfStatement {

    public static void main(String[] args) {
        int marks =55;
        if(marks>90)
        {
            System.out.println("Student Has got A++ grade....");
        }
        else if (marks>80 && marks <=90)
        {
            System.out.println("Student has got A+ grade");
        }

        else if (marks>70 && marks <=80)
        {
            System.out.println("Student has got A grade");
        }
        else if (marks>60 && marks <=70)
        {
            System.out.println("Student has got B++ grade");
        }
        else if (marks>50 && marks <=60)
        {
            System.out.println("Student has got B grade");
        }
        else
        {
            System.out.println("Sorry...the student has scored below 60...grade E is assigned...");
        }
    }
}
