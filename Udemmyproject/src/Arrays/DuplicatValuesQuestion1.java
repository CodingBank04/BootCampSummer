package Arrays;
import java.util.Scanner;
public class DuplicatValuesQuestion1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("PLEASE ENTER the size of an array;");
        int size= scan.nextInt();
         int [] arr = new int [size];
         for (int k=0; k<arr.length; k++) {
             System.out.print("ENTER ELEMENTS OF AN ARRAY;");
             arr[k] = scan.nextInt();
         }

        //int[] arr = {2, 6, 4, 3, 2, 8, 6, 4, 9, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i ] == arr[j]) {
                    System.out.print(arr[j]+"\t");
                }
            }
        }
    }
}