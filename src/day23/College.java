package day23;

public class College {
    String collegeName;
    int totalNumberOfStudents;

    public College(String collegeName, int totalNumberOfStudents, boolean isAuthorized, int establishedYear) {
        this.collegeName = collegeName;
        this.totalNumberOfStudents = totalNumberOfStudents;
        this.isAuthorized = isAuthorized;
        this.establishedYear = establishedYear;
    }

    boolean isAuthorized;
    int establishedYear;


}
