package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int number;
        String n;
        do {
            n = console.nextLine();
            number = console.nextInt();
            for (int t = 1; t < number && number < 5; t++)
                System.out.println(n);
        } while (false);
        System.out.println(n);
    }
}
