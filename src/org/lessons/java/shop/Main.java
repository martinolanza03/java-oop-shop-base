package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto pomodoro = new Prodotto("pomodoro", "è rosso", 44.0f, 0.22f);

        System.out.println(pomodoro.getName());
        System.out.println(pomodoro.getDescription());
        System.out.println(pomodoro.getPrice());
        System.out.println(pomodoro.getPriceIva());

    }
}
