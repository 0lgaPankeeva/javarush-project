package com.javarush.task.pro.task05.task0514;

import java.util.Arrays;

/* 
Выводим двумерные массивы
*/

public class Solution {

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        //напишите тут ваш код
        String string = Arrays.deepToString(strings);
        String intA = Arrays.deepToString(ints);

        System.out.println(string);
        System.out.println(intA);
    }
}
