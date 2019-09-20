package Arrays;

import java.util.Arrays;

public class ArrayRandomMethod {
    public static int[] createArrayRandomIntegers(int length) {
        int[] arrRandom = new int[length];
        double randomNumber;
        for (int i = 0; i < arrRandom.length; i++) {
            randomNumber = Math.random() * (5000 - 1000) + 1000;
            arrRandom[i] = (int) randomNumber;
        }
        return arrRandom;
    }

    public static void main(String[] args) {
        int [] random= createArrayRandomIntegers(8);
        System.out.println(Arrays.toString(random));

    }
}

