package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int min2 = Integer.MIN_VALUE;

        while (console.hasNextInt()) {
            { int x = console.nextInt();
                if (x < min) {
                    min = x;
                    min2 = min;
                }
                System.out.println(min2);
            }
        }
    }
}