package OCAudemy;

import javax.swing.*;

public class RecapDemo {
    public static void main(String[] args) {


        double[] myList = {1, 2, 3, 4, 5, 6, 7};
        double total=0;
        double max=myList[0];
        for (double number : myList){
            if(max<number){
                max=number;
            }
            total =total +number;
        System.out.println(number);
    }
        System.out.println("sum " + total);
        System.out.println("max " + max);
}}