package Methods;

public class MethodsAllTogether {
    static int balance = 200000;

    public static void main(String[] args) {

        MethodsAllTogether.printNumbers();
    }

    static void printNumbers() {
        int start = 1;
        while (start <= 100) {
            System.out.println(start);
            start++;
        }
    }

    public static void printMultipicationTable() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
    }

    public static void displayOddNumbers() {
        for (int i = 4; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            System.out.println();

        }

    }


    public static void printOddNumbers(int start, int stop) {
        if (start <= stop) {

            int number = start;
            do {
                if (number % 2 == 1) {
                    System.out.println(number);
                }
                    number++;
                }
                while (number < stop) ;

            }

     else{
                System.out.println("start should be smaller than stop ");
            }
        }
    }

