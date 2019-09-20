package Arrays;

import java.util.Arrays;


public class CommonElements {
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5,6,7,8,9};
        int [] array2={4,5,7,12,13,34,61};
        findCommon(array1,array2);
    }
    public static void findCommon(int[] arr1 , int  arr2[]){

        for (int i=0; i<arr1.length ; i++){
            for( int j=0; j< arr2.length; j++){

                if (arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);

                }


            }
        }

    }


    }


