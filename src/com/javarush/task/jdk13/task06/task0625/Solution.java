package com.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Минимальная сумма
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int minSum = Integer.MAX_VALUE;

        //сумма по строкам
        for (int j = 0; j < array[0].length; j++) {
            int currentSum = 0;
            for (int i = 0; i < array.length; i++) {
                currentSum += array[i][j];
            }
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }

        //сумма по столбцам
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum < minSum) {
                minSum = sum;
            }
        }

        System.out.println(minSum);
    }
}