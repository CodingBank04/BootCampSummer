package MyStudy;
import java.util.Scanner;
public class Boykutlekosullu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println(("Please enter your weight;"));
        int weight = scanner.nextInt();

        System.out.println("Please enter your height;");
        int height=scanner.nextInt();

        double bim = (weight/(height*height));

        if (bim<18.5){
            System.out.println("Skinny");

        }
        else if(bim>=18.5 && bim<25){
            System.out.println("skinny");

        }
        else if(bim>=25&& bim<30){
            System.out.println("overweight");


        }
        else{
            System.out.println("obese");
        }
}}
