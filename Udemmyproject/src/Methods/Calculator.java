package Methods;
import java.util.Scanner;
public class Calculator {
    public static int substraction(int a , int b){
        return(a-b);

    }
    public static double division(int a, int b){
        return ((double)a/b);
    }

    public static int addition(int a , int b){
        return (a+b);

    }
    public static int toplama(int a,int b, int c){
        return(a + b+ c);
    }
    public static int multipication(int a, int b){
        return a*b;
    }
    public static int multipication(int a, int b, int c){
        return a*b*c;



}

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);


        String processor= ("1.Addition\n") +("2.substraction\n")+("3.multipication\n")+("4.division\n");
        System.out.println("*****************************************");
        System.out.println(processor);
        System.out.println("*****************************************");

        while(true){
            System.out.print("choose any processor");
            String process =scanner.nextLine();

            if(process.equals("q")){
                System.out.println(("Exit"));
                break;
            }
            else if(process.equals("1")){
                System.out.println("how many numbers are you going to add?(2 or 3)");
                int howmanynumbers=scanner.nextInt();
                if(howmanynumbers==2){
                    System.out.println("a:");
                    int a= scanner.nextInt();
                    System.out.println("b:");
                    int b=scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("total of number;"+ (addition(a,b)));



                }
                else if(howmanynumbers==3){
                    System.out.println("a:");
                    int a= scanner.nextInt();
                    System.out.println("b:");
                    int b=scanner.nextInt();
                    System.out.println("c:");
                    int c=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("total of number="+ (toplama(a,b,c)));
                }


                else{
                    System.out.println(" no such method");
                }
            }
        else if(process.equals("2")){
                System.out.println("a:");
                int a= scanner.nextInt();
                System.out.println("b:");
                int b=scanner.nextInt();
                scanner.nextLine();

                System.out.println(("differnce of number="+ substraction(a,b)));
            }
        else if(process.equals("3")){
                System.out.println("a:");
                int a= scanner.nextInt();
                System.out.println("b:");
                int b=scanner.nextInt();
                scanner.nextLine();

                System.out.println("multipication of numbers =" + multipication(a,b));
            }
        else{
            }


        }
    }}
