package Arrays;

public class ArrayMergeCW {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7};
        int[] resultArray = mergeTwoArrays(arr1,arr2);
        //MyArrayMethods.listAllElement(resultArray);
        for(int i=0 ; i<resultArray.length ; i++){
            System.out.print(resultArray[i]+" ");
        }
    }
    public static int[] mergeTwoArrays(int[] array1,int[] array2){
        int size = array1.length + array2.length;
        int[] mergedArray = new int[size];
        int index=0;
        for(int i=0 ; i<array1.length ; i++){
            mergedArray[index] = array1[i];
            index++;
        }
        for(int j=0 ; j<array2.length ; j++){
            mergedArray[index] = array2[j];
            index++;
        }
        return mergedArray;
    }
}
