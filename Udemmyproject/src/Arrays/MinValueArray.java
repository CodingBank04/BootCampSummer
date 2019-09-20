package Arrays;

public class MinValueArray {
    public static void main(String[] args) {
        int [] myArray={-4,3,4,-15};
        System.out.println(findMinValue(myArray));
    }
    public static int findMinValue(int[]arr){

        int minNum=arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]<minNum){
                minNum=arr[i];
            }

        }
        return minNum;
    }
}

