package Arrays;

import java.util.Scanner;

public class NumOdds {
    public static void main(String[] args) {

        /*
        public static void main(String[] args) {

    int[] myArray= {1, 2, 3,4,5,6,7,8,9,11};
        for( int i=0 ; i<myArray.length; i++){
        if(i %2!=0){
            System.out.println(i);
         */

        int[] myArray= {1, 2, 3,4,5,6,7,8,9,11};
        int counter=0;
        for( int i=0 ; i<myArray.length; i++){
            if(myArray[i]%2!=0){
                counter++;
                counter=counter+1;
                counter=counter+1;

            }
        }
        System.out.println(counter);

        Scanner scanner =new Scanner(System.in);
        int [] myArr = new int[5];
        for(int i=0; i<myArr.length; i++){
                                                 //int number;
        System.out.print("Enter number; ");
                                                 //number=scanner.nextInt();
                                                  //myArr[0]=number;
        myArr[i]=scanner.nextInt();
    }
        //System.out.println(myArr); address of object
        int numberofOdds=0;
        for(int i=0; i<myArr.length; i++){
            if(myArr[i]%2==1){
                numberofOdds++;
            }
        }
        System.out.println("There are "+ numberofOdds + "odd numbers in your number");
}

}




