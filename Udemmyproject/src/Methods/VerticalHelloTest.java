package Methods;
import java.util.Scanner;
public class VerticalHelloTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(("Please enter the string"));
        String inputString=scanner.nextLine();
        VerticalHello.verticalHello(inputString);
    }
}
