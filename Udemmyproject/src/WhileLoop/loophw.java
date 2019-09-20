package WhileLoop;

public class loophw {
    public static void main(String[] args) {

        System.out.println("Numbers while loop");
        int n = 1;
        int i = 1;

        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print(n++ + " ");
                j++;
            }
            i++;

            System.out.println();
        }
    }}



