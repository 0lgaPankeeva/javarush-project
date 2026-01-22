package com.javarush.task.pro.task10.task1017;

/* 
Создание материков
*/

public class Earth {
    private int area;

    public static void main(String[] args) {
        //напишите тут ваш код
        Earth Africa = new Earth();
        Africa.area = 30;

        Earth Antarctica = new Earth();
        Antarctica.area = 14;

        Earth Australia = new Earth();
        Australia.area = 7;

        Earth Eurasia = new Earth();
        Eurasia.area = 54;

        Earth NortAmerica = new Earth();
        NortAmerica.area = 24;

        Earth SouthAmerica = new Earth();
        SouthAmerica.area = 18;
    }
}
