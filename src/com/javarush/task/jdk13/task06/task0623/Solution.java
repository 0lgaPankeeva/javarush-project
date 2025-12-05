package com.javarush.task.jdk13.task06.task0623;

/* 
Знакомство с двумерным массивом
*/

public class Solution {
    public static int[][] array = new int[2][3];//напишите тут ваш код

    public static void main(String[] args) {
        //напишите тут ваш код
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j] + " ");
            }
        }
    }
}
