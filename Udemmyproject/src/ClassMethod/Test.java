package ClassMethod;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        Invoices invoice = new Invoices();
        System.out.println("What is your electric consuption?");
        int consumpt=scan.nextInt();

        String myElectric= invoice.evauluateElectric(800);

        System.out.println("What is your internet speed?");
        int speed=scan.nextInt();
        String myInternet=invoice.evalutateInternet(250);

        Loans loan= new Loans();
        System.out.println("Your monthly payment");
        int montlyPay=scan.nextInt();
        System.out.println("Which payment as a month");
        int month=scan.nextInt();

        int mortage= loan.calcualteMortage(15,1800);
        System.out.println("whats your car total price");
        int carPrice=scan.nextInt();
        System.out.println("what is your instalment quantity");
        int months=scan.nextInt();
        double carInsurance=loan.calculateCarInsurance(50000,72);


        System.out.println("your electric is " + myElectric );
        System.out.println("your internet is "+ myInternet);
        System.out.println("Your mortage is"+ mortage);
        System.out.println("your insurance is "+ carPrice);

       Suggestions suggestions = new Suggestions();
       suggestions.foodSuggestion();
       suggestions.clothSuggestion();

    }

}
