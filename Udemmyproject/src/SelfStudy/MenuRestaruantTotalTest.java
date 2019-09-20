package SelfStudy;

import java.sql.SQLOutput;

public class MenuRestaruantTotalTest {
    public static void main(String[] args) {

        MenuRestaruantTotal.displayMenu();

        double soup =MenuRestaruantTotal.displayReceipt(3);
        double meal=MenuRestaruantTotal.displayReceipt(4);
        double salad=MenuRestaruantTotal.displayReceipt(7);

        double total= soup +meal +salad;
        System.out.println("\nYOUR TOTAL PAYMENT IS  $       :$" + total);
        System.out.println("      ENJOY YOUR MEAL!");
    }
}
