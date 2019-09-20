package WhileLoop;

public class DiamondForLoop {
    public static void main(String[] args) {


     System.out.println("Diamond  for loop");
    // top of the diamond
            for(
    int line = 5;
    line >=1;line--)

    {
        for (int d = 1; d <= (line - 1); d++) {
            System.out.print(" ");
        }
        for (int h = 1; h <= (11 - 2 * line); h++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //bottom of the diamond
            for(
    int line = 1;
    line <=4;line++)

    {
        for (int skip = 1; skip <= line; skip++) {
            System.out.print(" ");
        }
        for (int z = 1; z <= (9 - 2 * line); z++) {
            System.out.print("*");
        }
        System.out.println();

    }
}}