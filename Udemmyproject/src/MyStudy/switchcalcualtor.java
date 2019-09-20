package MyStudy;
import java.util.Scanner;
public class switchcalcualtor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("*********************************");

        String binaryoperators ="1.Addition\n" + "2 Substraction\n" + "3.Multipication\n" + "4.Division\n";

        System.out.println(binaryoperators);
        System.out.println("************************************");

        System.out.println("Choose given binary operators:");
        String boperators=scanner.nextLine();
        int a;
        int b;

        switch(boperators){
            case "1":
                System.out.println("Please enter your first number:");
                a=scanner.nextInt();
                System.out.println("Please enter your second number:");
                b=scanner.nextInt();
                System.out.println("Addition:"+ (a+b));
                break;
            case "2":
                System.out.println("Please enter your first number:");
                a=scanner.nextInt();
                System.out.println("Please enter your second number:");
                b=scanner.nextInt();
                System.out.println("Addition:"+ (a-b));
                break;

            case "3":
                System.out.println(" Please enter your first number: ");
                a=scanner.nextInt();
                System.out.println("Please enter your second number:");
                b=scanner.nextInt();
                System.out.println("Multipication:" + (a*b));
                break;

            case "4":
                System.out.println(" Please enter first number: ");
                a=scanner.nextInt();
                System.out.println("Please enter your second number:");
                b=scanner.nextInt();
                System.out.println("Multipication:" + ((double)a/b));
                break;

            default:
                System.out.println("Invalid Number");
        }
    }
}
