package Laba1;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class Massive {


    public void PrintArray() {
        int[][] array = new int[5][5];
        int n = array.length;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j + i == n - 1) {
                    array[i][j] *= 2;
                }
            }
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static int[] FillArray(int begin, int end, int step) throws Exception {
        if (step == 0) {
            throw new Exception("\n" +
                    "invalid number");

        }
        if (begin == end) {
            return new int[0];
        }
        if (begin > end)
            Math.abs(step);

        int quantity = 1 + ((end - begin) / step);
        int[] array = new int[quantity];
        array[0] = begin;
        for(int i=1; i<array.length; i++) {
            array[i] = array[i - 1] + step;
        }
        return array;
    }
    public static void showArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


