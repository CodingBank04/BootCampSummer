package WhileLoop;

public class PracticeLoop {
        public static void main(String[] args) {
            int i =0;
            while(i<=5){
                int j= 0;
                while (j<i){
                    System.out.print("*");
                    j++;
                }
                System.out.println("");
                i++;

    }}}

        /*for (int i = 1; i < 6; i++) {
            for (int k = 5; k > i-1; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" *");
            }
            System.out.println();}
        for (int a = 1; a < 6; a++) {

            for (int b = 1; b < a; b++) {
                System.out.print(" ");
            }
            for (int s = 5; s > a-1; s--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

*/