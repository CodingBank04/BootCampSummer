package Methods;
import java.util.Scanner;
public class ShapeTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of lines?");
        int linesPyramid = scanner.nextInt();
        System.out.print("Symbol of the Pyramid?");
        String symbolPyramid = scanner.next();
        ShapePyramid.printPyramid(linesPyramid,symbolPyramid);
        //Shapes.printUpSideDownPyramid();
    }
}


