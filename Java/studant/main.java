public class main {

    public static void main (String [] args) {

        Studantprofile studantA = new Studantprofile("Jessica", "Portella", "Game",8, 2024);
        Studantprofile studantB = new Studantprofile("Daniel", "Prietsch", "IT",10,2020 );

        studantA.studantExpectedGraduation();
        System.out.println(studantA.expectedyeargraduate);

    }
}
