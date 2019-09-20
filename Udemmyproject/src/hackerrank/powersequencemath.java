package hackerrank;
import java.util.Scanner;
public class powersequencemath {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int seq= a+(int)Math.pow(2,0)*b;
            System.out.print(seq+" ");

            for(int j=1;j<n; j++){
                seq =seq +(int)Math.pow(2,j)*b;
                System.out.print(seq + " ");

            }
            System.out.println();
        }
        in.close();
    }
}

