package WhileLoop;
import java.util.Scanner;
public class nestedloopEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0; int j=0;


        for ( i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(; i>=0;i--){
            for(j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
