package Laba1;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class Massive   {


    public void PrintArray(){
        int[][] array = new int[5][5];
        int n = array.length;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }

        for (int i =0; i < array.length; i++){
            for (int j =0; j < array[i].length; j++){
                if(j + i == n -1){
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


        public void  FillArray()
        {
            Random random = new Random();
            int[] array = new int[random.nextInt(20)];
            int begin = random.nextInt(20);
            int step = random.nextInt(30);
            System.out.println("---------------");
            for (int i = 0; i < array.length; i++) {
                array[i] = begin;
                begin = array[i] + step;
                System.out.print(array[i] + "  ");
            }
        }
        }

