package meNu;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Display.displayMenu();

        Scanner ask =new Scanner(System.in);
        System.out.print("Soup? (1-2-3)>>");
        int soup= ask.nextInt();

        System.out.print("Meals? (1-2-3)>>");
        int meal= ask.nextInt();

        System.out.print("SALADS? (1-2)>>");
        int salad= ask.nextInt();

         Display.displayReceit(soup,meal,salad);



    }
}
