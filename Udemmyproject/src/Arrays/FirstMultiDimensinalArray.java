package Arrays;

public class FirstMultiDimensinalArray {
    public static void main(String[] args) {
        int[][] multi = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.println(multi[i][j]);
            }
            System.out.println();
        }
        String[][] months = {{"june", "july", "august"}, {"october", "dececmber", "november"}, {"february", "march", "april"}};

        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                System.out.println(months[i][j]);

            }
            System.out.println();

        }
        char[][] letters = {{'a', 'b', 'c'}, {'r', 't', 'y'}, {'i', 'i', 'm'}};
        char[][] abc = new char[3][4];

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                System.out.println(letters[i][j]);
            }
        }
    }}