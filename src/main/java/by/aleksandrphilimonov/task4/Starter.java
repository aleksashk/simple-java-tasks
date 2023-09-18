package by.aleksandrphilimonov.task4;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9, 9})));
    }

    public static int[] plusOne(int[] number) {
        for (int i = number.length - 1; i >= 0; i--) {
            if (number[i] == 9) {
                number[i] = 0;
            } else {
                number[i]++;
                return number;
            }
        }
        number = new int[number.length + 1];
        number[0] = 1;
        return number;
    }
}
