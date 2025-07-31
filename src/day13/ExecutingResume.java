package day13;

public class ExecutingResume {
    public static void main(String[] args) {

        System.out.println("========================Jason============================");
        Resume jasonResume = new Resume();
        jasonResume.fName = "Jason";
        jasonResume.lName = "Roger";
        jasonResume.age = 25;
        jasonResume.gender = 'm';
        jasonResume.isFromIT = false;

        System.out.println("First Name: " + jasonResume.fName + ", LastName: " + jasonResume.lName + ", Age: " + jasonResume.age + ", Gender: " + jasonResume.gender + ", An IT Person: " + jasonResume.isFromIT);

        System.out.println("========================Kerrie============================");

        Resume kerrieResume = new Resume();
        kerrieResume.fName = "Kerrie";
        kerrieResume.lName = "Wright";
        kerrieResume.age = 19;
        kerrieResume.gender = 'f';
        kerrieResume.isFromIT = true;

        System.out.println("First Name: " + kerrieResume.fName + ", LastName: " + kerrieResume.lName + ", Age: " + kerrieResume.age + ", Gender: " + kerrieResume.gender + ", An IT Person: " + kerrieResume.isFromIT);

        System.out.println("========================Ben============================");

        Resume benResume = new Resume();
        benResume.fName = "Ben";
        benResume.lName = "Fletcher";
        benResume.age = 32;
        benResume.gender = 'm';
        benResume.isFromIT = true;

        System.out.println("First Name: " + benResume.fName + ", LastName: " + benResume.lName + ", Age: " + benResume.age + ", Gender: " + benResume.gender + ", An IT Person: " + benResume.isFromIT);

    }
}
