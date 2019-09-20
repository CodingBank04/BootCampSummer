package Arrays;

public class MultiDimensionStringArray {
    public static void main(String[] args) {
        String[][] months = {{"june", "july", "august"}, {"october", "dececmber", "november"}, {"february", "march", "april"}};

        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                System.out.println(months[i][j]);
            }

    }}}