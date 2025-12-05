package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto item1 = new Prodotto("Crema Idratante", new BigDecimal(13.50));
        Prodotto item2 = new Prodotto("Caramelle",  new BigDecimal(7.20));

        item1.setIVA(0.4f);
        item2.setIVA(2.78f);
        
        item1.setDescription("Your dermatologist first choice!");

        System.out.println(item1.getPrice());
        System.out.println(item1.getTaxedPrice());
        System.out.println(item2.getFullID());

        SmartPhone iphone = new SmartPhone("iphone12", 64);
        System.out.println(iphone.toString());
        Television tv = new Television("SonyPro", new int[] {35,55});
        System.out.println(tv.toString());

    }
}