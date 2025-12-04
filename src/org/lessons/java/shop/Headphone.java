package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphone extends Prodotto{
    private String color;
    private boolean wireless;

    public Headphone(String name, BigDecimal price, String color, boolean wireless) {
        super(name, price);
        this.color = color;
        this.wireless = wireless;
    }

    public Headphone() {
        this("", new BigDecimal(0), "black", false);
    }

    public String getColor() {
        return this.color;
    }

    public boolean getWireless() {
        return this.wireless;
    }
}
