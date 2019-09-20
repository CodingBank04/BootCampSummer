package MyStudy;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        /*

        While döngüsü yardımıyla bir tane ATM programı yapmaya çalışın.

        select your transaction
        1.transaction : Balance
        2.transaction : Withdravel
        3.transaction : Deposit
        Exit : press q

        */
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        String Transaction = "1.transaction : Balance\n"
                + "2.transaction : Withdravel\n"
                + "3.transaction : Deposit\n"
                + "Exit : press q";

        System.out.println("*************************");
        System.out.println(Transaction);
        System.out.println("*************************");

        while (true) {

            System.out.print("Choose Transaction: ");
            String transaction = scanner.nextLine();

            if (transaction.equals("q")) {

                System.out.println("Exit from System...");
                break;
            }
            else if (transaction.equals("1")){
                System.out.println("Balance : " + balance);
            }
            else if (transaction.equals("2")){
                System.out.print("Please choose amount : ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                if (balance - amount < 0) {

                    System.out.println("You dont have enough balance . Balance : " + balance);
                }
                else {
                    balance -= amount;
                    System.out.println("New balance : " + balance);
                }


            }
            else if (transaction.equals("3")){
                System.out.print("please choose amount you want to insert : ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                balance += amount;

                System.out.println("New balance : " + balance);

            }
            else {
                System.out.println("Invalid Transaction..");
            }


        }



    }
}



