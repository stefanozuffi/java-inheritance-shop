package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto item1 = new Prodotto("Crema Idratante", 13.50f);
        Prodotto item2 = new Prodotto("Caramelle", 7.20f);

        item1.setIVA(0.4f);
        item2.setIVA(2.78f);
        
        item1.setDescription("Your dermatologist first choice!");

        System.out.println(item1.getPrice());
        System.out.println(item1.getTaxedPrice());
        System.out.println(item2.getFullID());

        System.out.println(item1.description);


    }
}