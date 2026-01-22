package com.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфона
*/

public class Iphone {
    private  String model;
    private  String color;
    private  int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


//напишите тут ваш код
@Override
    public boolean equals(Object obj) {
    if (obj == null) {
        return false;
    }

    if (this.getClass() != obj.getClass()) {
        return false;
    }
    Iphone other = (Iphone) obj;

    return (price == other.price) &&
            Objects.equals(this.model, other.model) &&
            Objects.equals(this.color, other.color);
}

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
