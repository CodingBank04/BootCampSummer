package Arrays;
/*
Cut in a half any given integer array with even number length and create 2 arrays​
​
Sample array : {1,2,3,4,5,6,7,8,9}​
​
Output:​
​
{1,2,3,4,5}​
​
{6,7,8,9}​
 */
public class SplitArray {
        public static void main(String[] args) {
            int[] myArr = {1,2,3,4,5,6,7,8,9,10}; //input array
            int lengthArray = myArr.length; //to calculate length of input array
            int halfLength = lengthArray/2; //to use sub array initizilation
            int index=0; // to be able to reset index numbers
            int[] array1 = new int[halfLength]; //output array 1 initilization
            int[] array2 = new int[halfLength]; //output array 2 initilization
            for(int i=0 ; i<lengthArray ; i++){
                if(i<halfLength) { //to put values arr1
                    array1[index] = myArr[i];
                }
                else{ //to put values arr2
                    array2[index] = myArr[i];
                }
                index++;
                //if you reached half length reset the counter
                if(index>=halfLength){
                    index=0;
                }
            }
            //print arr1
            for(int i=0 ; i<halfLength ; i++){
                System.out.print(array1[i]);
            }
            System.out.println();
            //print arr2
            for (int j=0 ; j<halfLength ; j++){
                System.out.print(array2[j]);
            }
        }
    }

