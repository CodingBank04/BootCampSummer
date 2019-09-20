package WhileLoop;

import java.util.Scanner;

public class examplewholetriangle {
    public static void main(String[] args) {
        System.out.print("Hello ! How many stars would you like ?");
        Scanner scan=new Scanner(System.in);
        int num0fStars =scan.nextInt();


        for (int i = 1; i <= num0fStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=num0fStars-1; i>0;i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}



