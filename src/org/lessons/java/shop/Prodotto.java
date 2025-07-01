package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String desc;
    private float price;
    private float iva;

    public Prodotto() {

        this.code = 0;
        this.name = "";
        this.desc = "";
        this.price = 0;
        this.iva = 0;
    }

    public Prodotto(String name, String desc, float price, float iva) {
        Random random = new Random();

        this.code = random.nextInt(99999);
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.iva = iva;
    }

    // Name
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    // Description
    public String getDescription() {
        return this.desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    // Price
    public float getPrice() {
        return this.price;
    }

    private void setPrice(float price) {
        this.price = price;
    }

    // Price Iva
    public float getPriceIva() {
        if (price != 0 && iva != 0) {
            return this.price = price + (price * iva);
        }
        return 0;
    }

    private void setPriceIva(float iva) {
        this.iva = iva;
    }

    public String getExtendedName() {
        if (name != null) {
            return code + "-" + name;
        }
        return null;

    }
}
