public class Studantprofile {
    String firstname;
    String lastname;
    String declaremajor;
    double gpa;
    int expectedyeargraduate;


    public Studantprofile (String firstname, String lastname,String declaremajor, double gpa, int expectedyeargraduate){
        this.firstname = firstname;
        this.lastname = lastname;
        this.gpa = gpa;
        this.expectedyeargraduate = expectedyeargraduate;
        this.declaremajor = declaremajor;

    }

    public void studantExpectedGraduation () {

        this.expectedyeargraduate = this.expectedyeargraduate +1;

    }
}
