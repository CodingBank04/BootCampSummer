package Arrays;

public class SymmetricArray {
    public static void main(String[] args) {
        int[] symArray={1,2,3,3,2,1};
        System.out.println(isSymmetric(symArray));

    }
    public static boolean isSymmetric(int[] arr){
        boolean result= true;
        int index =arr.length-1;

        for(int i=0; i<arr.length/2; i++){
            if(arr[i]!=arr[index]){
                result=false;

            }
            index--;

        }
        return result;
    }
}

