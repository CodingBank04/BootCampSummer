package meNu;

import jdk.swing.interop.SwingInterOpUtils;

public class Display {

    public static void displayMenu() {

        System.out.println("THE BEST RESTAURANT EVER!\n");
        System.out.println("*********************************\n");

        System.out.println("SOUPS");
        System.out.println("____________________________________");
        System.out.printf("%3s %s  %5s", "1-)", "Lentil", "2.99\n");
        System.out.printf("%3s %s  %5s", "2-)", "Tomato", "3.99\n");
        System.out.printf("%3s %s  %5s", "3-)", "Fish", "8.99\n\n");


        System.out.println("MEALS");
        System.out.println("____________________________________");

        System.out.printf("%3s %s  %5s", "1-)", "Rice", "6.99\n");
        System.out.printf("%3s %s  %5s", "2-)", "Chicken", "4.99\n");
        System.out.printf("%3s %s  %5s", "3-)", "Beef", "8.99\n\n");

        System.out.println("SALADS");
        System.out.println("____________________________________");

        System.out.printf("%3s %s  %5s", "1-)", "Ceaser", "2.99\n");
        System.out.printf("%3s %s  %5s", "2-)", "Waldrof", "3.99\n");


    }

    public static void displayReceit(int soup, int meal, int salad) {
        double totalPrice=0;
        if (soup == 1) {
            System.out.println("lentils soups = $ 2.99");
            totalPrice=totalPrice + 2.99;

        } else if (soup == 2) {
            System.out.println("tomato soups = $ 3.99");
            totalPrice=totalPrice + 4.99;


        } else {
            System.out.println("fish soup = $ 8.99");
            totalPrice=totalPrice + 8.99;


        }

        if (meal == 1) {
            System.out.println("rice = $ 4.99");
            totalPrice=totalPrice + 4.99;

        } else if (meal == 2) {
            System.out.println("chicken = $ 3.99");
            totalPrice=totalPrice + 3.99;


        } else {
            System.out.println("beef = $ 8.99");
            totalPrice=totalPrice + 8.99;


        }
        if (salad == 1) {
            System.out.println("Ceaser = $ 2.99");
            totalPrice=totalPrice + 2.99;



        } else {
            System.out.println("Waldorff = $ 8.99");
            totalPrice=totalPrice + 8.99;


        }
        System.out.println("Your Total is:"+ totalPrice);




    }

}