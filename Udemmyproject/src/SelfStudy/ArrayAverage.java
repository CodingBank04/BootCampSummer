package SelfStudy;

import java.util.Scanner;

public class ArrayAverage {
    public static void main(String[] args) {

        int [] arr2= {20,40,50,60,4};

        int total =0;

        for (int i=0 ; i<arr2.length; i++){
            total+= arr2[i];
        }
        System.out.println(("averegae of my array : "+(double)total/arr2.length));

        //int[] arr = new int[1];
        //arr[0] = 10;
        //System.out.println(arr[0]);

        int[] arr1 = new int[2];
        for(int i=0; i < arr1.length; i++){
            System.out.print("hai ");
        }
    }


}
