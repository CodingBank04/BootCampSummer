package hackerrank;
import java.util.Scanner;
public class loopsample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i=1;i<=9;i++){
            System.out.println(N +" x "+i+ " = " + N*i);
        }
        scanner.close();

    }

}

