import java.util.Scanner;

public class salary {

    public static double salary (double hoursW, double moneyH, double vacation){

        double daysoff = (vacation*8)*moneyH;
        double salaryfinal = (hoursW*moneyH)*52 - daysoff;

        return salaryfinal;

    }

    public static void  main (String args [] ){

       System.out.println("How many hours the employee works per week?");

        Scanner input1 = new Scanner(System.in);

        double hoursweek = Double.parseDouble(input1.next());

        while (hoursweek <= 0){
           System.out.println("Number of hours invalid. Retype:");

           Scanner reinput1 = new Scanner(System.in);

            hoursweek = Double.parseDouble(reinput1.next());
        }

        System.out.println("How much money the employee makes per hour?");

        Scanner input2 = new Scanner(System.in);
        double moneyHour = Double.parseDouble(input2.next());

        while (moneyHour <= 0){
            System.out.println("Number of hours invalid. Retype: ");

            Scanner reinput2 = new Scanner(System.in);

            moneyHour = Double.parseDouble(reinput2.next());
        }

        System.out.println("How many vacation days does the employee have?");

        Scanner input3 = new Scanner(System.in);
        double daysvacation = Double.parseDouble(input3.next());

        System.out.println("The salary is "+  salary(hoursweek,moneyHour,daysvacation)+ " reais per year.");

    }

}