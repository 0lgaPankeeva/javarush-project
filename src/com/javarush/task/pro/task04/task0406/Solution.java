package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        while (true) {

            String text = console.nextLine();
            if (text.equals("enough")) {
                break;
            }
            System.out.println(text);
        }
    }
}