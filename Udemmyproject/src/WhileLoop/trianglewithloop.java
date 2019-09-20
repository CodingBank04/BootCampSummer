package WhileLoop;

import java.util.Scanner;

public class trianglewithloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows to be printed");
        int rows = sc.nextInt();
        int n = 1;

        for (int i = 1; i <= rows; i++) {

            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(n++ + (" "));
            }

            System.out.println();
        }
    }
}


