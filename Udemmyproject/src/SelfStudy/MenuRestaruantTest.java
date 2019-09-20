package SelfStudy;

import java.util.Scanner;

public class MenuRestaruantTest {
    public static void main(String[] args) {
        MenuRestaruant.displayMenu();

        Scanner read = new Scanner(System.in);

        System.out.println("\n................... ");


        System.out.print(" \n SOUPS #(1-3):");
        int intSoup = read.nextInt();

        System.out.print("\n MEALS #(4-6):");
        int intMeal = read.nextInt();

        System.out.print("\nSALAD #(7-8):");
        int intSalad = read.nextInt();

        MenuRestaruant.displayReceipt(intSoup,intMeal,intSalad);







    }
}
