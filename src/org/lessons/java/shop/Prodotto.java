package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int code;
    public String name;
    public String desc;
    public float price;
    public float iva;

    public Prodotto(String name, String desc, float price, float iva) {
        Random random = new Random();

        this.code = random.nextInt(99999);
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.iva = iva;
    }

    public float getPrice() {
        return this.price;
    }

    public float getPriceIva() {
        if (price != 0 && iva != 0) {
            return this.price = price * iva;
        }
        return 0;
    }

    public String getExtendedName() {
        if (name != null) {
            return code + "-" + name;
        }
        return null;

    }
}
