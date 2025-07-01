package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto pomodoro = new Prodotto("pomodoro", "è rosso, molto buono", 22.2f, 0.22f);

        System.out.println(pomodoro.code);
        System.out.println(pomodoro.name);
        System.out.println(pomodoro.desc);
        System.out.println(pomodoro.getExtendedName());
        System.out.println(pomodoro.getPrice());
        System.out.println(pomodoro.getPriceIva());

    }
}
