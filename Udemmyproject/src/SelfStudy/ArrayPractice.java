package SelfStudy;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        int number []= new int[10];
        int myNumber[]={1,3,4,5,6,7,8};
        System.out.println(myNumber[3]);
         */
        int[] arr1={10,20,30,40,50};
        int [] arr2=new int[5];

         /*
         for(int i=0; i<arr1.length; i++){
                      System.out.println("Array :"+ arr1[i]);

          */
        System.out.println("enter array 2 value.......");

             for (int i=0 ; i<arr2.length; i++){
                 arr2[i]=scanner.nextInt();

             }
        System.out.println("printing array two value");
             for (int i=0 ; i<arr2.length; i++){
                 System.out.println("ARRRAY " + arr2[i]);

         }


    }


    }

