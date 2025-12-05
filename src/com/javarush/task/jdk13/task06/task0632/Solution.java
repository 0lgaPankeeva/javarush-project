package com.javarush.task.jdk13.task06.task0632;

import java.util.Scanner;

/* 
Пирамида
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
int height = console.nextInt();
int width = (height * 2) - 1;
array = new char[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int center = width / 2;
                if(j >= center - i && j <= center + i) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }

            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
