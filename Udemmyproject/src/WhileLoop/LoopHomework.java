package WhileLoop;

public class LoopHomework {
        public static void main(String[]args) {
            System.out.println("Numbers for loop");
            int printOut1 = 1;
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(printOut1++ + " ");
                }
                System.out.println();
            }
            System.out.println("Numbers while loop");
            int printOut2 = 1;
            int k = 1;
            while (k <= 5) {
                int m = 1;
                while (m <= k) {
                    System.out.print(printOut2++ + " ");
                    m++;
                }
                k++;
                System.out.println();
            }
            System.out.println("Diamond  for loop");
            // top of the diamond
            for (int line = 5; line >= 1; line--) {
                for (int d=1;d<=(line-1);d++){
                    System.out.print(" ");
                }
                for(int h=1;h<=(11-2*line);h++){
                    System.out.print("*");
                }
                System.out.println();
            }
            //bottom of the diamond
            for (int line = 1; line <= 4; line++) {
                for (int skip = 1; skip <=line ; skip++) {
                    System.out.print(" ");
                }
                for (int z = 1; z <= (9 - 2 * line); z++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Diamond while loop");
            //top of the diamond
            int q=5;
            while(q>=1){
                int w=1;
                while(w<=q-1){
                    System.out.print(" ");
                    w++;
                }
                int x= 1;
                while(x<=(11-2*q)){
                    System.out.print("*");
                    x++;
                }
                q--;
                System.out.println();
            }
            // bottom of the diamond
            int z=1;
            while(z<=4){
                int w=1;
                while(w<=z){
                    System.out.print(" ");
                    w++;
                }
                int x= 1;
                while(x<=(9-2*z)){
                    System.out.print("*");
                    x++;
                }
                z++;
                System.out.println();
            }


            System.out.println("Letters for loop");
            char c = 'A';
            for (int a = 1; a <= 5; a++) {
                for (int b = 1; b <= a; b++) {
                    System.out.print(c);
                }
                c++;
                System.out.println();
            }
            System.out.println("Letters while loop");
            char b = 'A';
            int p = 1;
            while (p <= 5) {
                int o = 1;
                while (p >= o) {
                    System.out.print(b);
                    o++;
                }
                System.out.println();
                p++;
                b++;
            }

        }
    }

