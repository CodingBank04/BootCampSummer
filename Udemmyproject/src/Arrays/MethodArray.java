package Arrays;

import java.util.Arrays;

public class MethodArray {

    public static int[] creatingRandomNumber(int size) {

        int[] arr = new int[10];
        for (int i = 0; i < size; i++) {
            double ranNumber;
            ranNumber = Math.random() * 4000 +1000;
            arr[i]=(int) ranNumber;


        }
        return arr;
    }

    public static void main(String[] args) {

        int random []=creatingRandomNumber(5);
        System.out.println(Arrays.toString(random));

    }
}
