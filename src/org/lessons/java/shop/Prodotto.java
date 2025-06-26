package org.lessons.java.shop;

public class Prodotto {
    public int code;
    public String name;
    public String desc;
    public float price;
    public float priceIva;
    public String extendedName;

    public Prodotto(int code, String name, String desc, float price) {

        this.code = code;
        this.name = name;
        this.desc = desc;

        basicPrice(price);
        changePriceIva(price);
        extendedName(code, name);
    }

    float changePriceIva(float price) {
        this.priceIva = price * 0.22f;
        return priceIva;
    }

    float basicPrice(float price) {
        this.price = price;
        return price;
    }

    String extendedName(int code, String name) {
        this.extendedName = code + "-" + name;
        return extendedName;
    }
}
