package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    private int codex;
    private String name;
    protected String description="";
    private BigDecimal price;
    protected float iva = 0.22f;
 
    //Constructor(s)
    public Prodotto() {
        this.codex = (new Random()).nextInt(99999);
        this.name = "";
        this.price = new BigDecimal(0);
    }

    public Prodotto(String name, BigDecimal price) {
        this.codex = (new Random()).nextInt(99999);

        this.name = name;
        this.price = price;
    }

    public Prodotto(String name, BigDecimal price, float iva) {
        this.codex = (new Random()).nextInt(99999);

        this.name = name;
        this.price = price;

        if (iva < 1 && iva > 0) {
            this.iva = iva;
        }
    }

    //Get Methods
    public int getCodex() {
        return this.codex;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price.setScale(2, RoundingMode.DOWN);
    }

    public BigDecimal getTaxedPrice() {
        return this.price.add((this.price.multiply(new BigDecimal(this.iva)))).setScale(2, RoundingMode.DOWN);
    }

    public String getFullID() {
        String codex_string = String.valueOf(this.codex);
        return this.name.trim().toUpperCase() + '-' + codex_string;
    }

    public String getDescription() {
        return this.description;
    }

    //Set Methods
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setDescription(String text) {
        this.description = text;
    }
    public void setIVA(float iva) {
        if (0 < iva && iva < 1) {
            this.iva = iva;
        }
    }

};