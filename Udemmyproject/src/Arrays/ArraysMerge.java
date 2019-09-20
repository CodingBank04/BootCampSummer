package Arrays;

public class ArraysMerge {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3,4 };
        int[] array2 = {5, 6,7 };
        int[] resultArray=mergeTwoArray(array1,array2);
           for(int i=0; i<resultArray.length; i++){
        System.out.println(resultArray[i] + " ");
    }}

    public static int[] mergeTwoArray(int[] array1, int[] array2) {
        int size = array1.length + array2.length;

        int[] mergedArray = new int[size];
        int index = 0;

        for (int i = 0; i < array1.length; i++) {
            mergedArray[index] = array1[i];
            index++;

        }
        for (int j = 0; j < array2.length; j++) {
            mergedArray[index] = array1[j];
            index++;

        }
        return mergedArray;
    }
}