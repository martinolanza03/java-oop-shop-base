package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto pomodoro = new Prodotto();

        pomodoro.setPrice(44.00f);
        pomodoro.setPriceIva(0.22f);

        System.out.println(pomodoro.getPrice());
        System.out.println(pomodoro.getPriceIva());

    }
}
