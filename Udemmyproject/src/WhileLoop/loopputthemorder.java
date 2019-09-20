package WhileLoop;


public class loopputthemorder {
    public static void main(String[] args) {

        char c = 'a';

        for (int i = 1; i <6; i++) {
            System.out.print(i + (" "));

            for (int j = 1; j < 3; j++) {

                System.out.print(c);
                c++;
                System.out.print((c++) + "");

            }

            System.out.println();
        }
    }
}
