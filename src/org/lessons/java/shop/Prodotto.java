package org.lessons.java.shop;


public class Prodotto {
    public double codex;
    public String name;
    public String description="";
    public float price;
    public float iva=0.22f;
 
    //Constructor(s)
    public Prodotto(String name, float price) {
        this.codex = Math.random() * 10;

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
    public float getPrice() {
        return this.price;
    }
    
    public float getTaxedPrice() {
        return (this.price * this.iva) + this.price;
    }

    public String getFullID() {
        String codex_string = String.valueOf(this.codex);
        return this.name.trim() + codex_string;
    }



};