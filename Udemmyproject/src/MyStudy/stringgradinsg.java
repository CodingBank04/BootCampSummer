package MyStudy;
public class stringgradinsg {
    public static void main(String[] args) {
        System.out.println("Please enter your grade:");
        int num =80;
        String grade ="";
        switch ((90 <= num && num <= 100 ) ? 0 : (80 <= num && num <= 89) ? 1 :  (70<=num && num<=79)? 2 : (60<=num && num<=69) ? 3:
                (50<=num && num<=59) ? 4 : (0<=num && num<=49)? 5: 6 )       {

            case 0:
                System.out.println("A+");
                break;
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Enter valid score");
                break;
        }

        System.out.println("You entered "+ num);
    }
}
