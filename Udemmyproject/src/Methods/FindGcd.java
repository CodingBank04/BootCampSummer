package Methods;
import java.util.Scanner;
public class FindGcd {
    public static int findingGcd(int num1,int num2) {
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {

            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;

            }

        }

        return gcd;
    }







    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Please Enter your First Number=  ");
        int number1= scanner.nextInt();
        System.out.print("Please Enter your Second Number= ");
        int number2=scanner.nextInt();
        System.out.println("Gcd of of two numbers:" + findingGcd(number1,number2));


    }
}
