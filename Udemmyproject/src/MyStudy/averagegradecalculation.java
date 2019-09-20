package MyStudy;
import java.util.Scanner;
public class averagegradecalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Grade1:");
        int grade1 = scanner.nextInt();
        System.out.print("Grade2:");
        int grade2 = scanner.nextInt();
        System.out.print("Final:");
        int Final = scanner.nextInt();


        System.out.println("Your GPA:");
        double average =(grade1 * 3/10.0 + grade2 * 3/10.0 ) + (Final*4/10.0);

        if(Final>=90){
            System.out.println("AA");
        }
        else if(Final>=80){
            System.out.println("BB");
    }
        else if(Final>=70){
            System.out.println("CC");
        }
        else if(Final>=60){
            System.out.println("DD");

    }
        else if(Final>50){
            System.out.println("FF");
    }
        else{
            System.out.println(" You Failed!");
        }
    }}

