package org.lessons.java.shop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomCode = random.nextInt((100000 - 10000) + 1);

        Prodotto pomodoro = new Prodotto(randomCode, "pomodoro", "è rosso, molto buono", 22.2f);

        System.out.println(pomodoro.code);
        System.out.println(pomodoro.name);
        System.out.println(pomodoro.desc);
        System.out.println(pomodoro.extendedName);
        System.out.printf("%.2f", pomodoro.price);
        System.out.printf("%.2f", pomodoro.priceIva);

    }
}
