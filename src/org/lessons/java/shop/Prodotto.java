package org.lessons.java.shop;

import java.util.Random;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {
    public int codex;
    public String name;
    public String description="";
    public BigDecimal price;
    public float iva = 0.22f;
 
    //Constructor(s)
    public Prodotto(String name, BigDecimal price) {
        this.codex = (new Random()).nextInt(99999);

        this.name = name;
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

    //Methods
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



};