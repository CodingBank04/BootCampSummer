package WhileLoop;

public class numberpyramidWhile {
    public static void main(String[] args) {
        int rows = 5, i = 1, j = 1;
        int n = 1;

        while (i <= rows) {
            while (j <=i) {
                System.out.printf("%3d" , n++ );
                j++;
            }
            System.out.print("\n");
            i++;
            j= 1;
        }

    }
}


