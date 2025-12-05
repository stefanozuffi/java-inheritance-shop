package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;


public class Carrello {

    static ArrayList<Prodotto> products = new ArrayList<>();

    public static void main() {

        System.out.println("Current Cart:");
        System.out.println("[");
        printCart();
        System.out.println("]");

        //Collect input and create respective objects
        Scanner input = new Scanner(System.in);

        System.out.println("Product Name: ");
        String productName = input.nextLine();

        System.out.println("Product Price: ");
        BigDecimal productPrice =new BigDecimal(input.nextLine());

        String productType = "";
        while (!productType.trim().toLowerCase().equals("s") && !productType.trim().toLowerCase().equals("t") && !productType.trim().toLowerCase().equals("h")) {
            System.out.println("Give a VALID product type: smartphone (S), television (T) or headphones (H)?");
            productType = input.nextLine();
        }

        Prodotto thisProduct;
        if (productType.trim().toLowerCase().equals("s")) {
            System.out.println("Give memory size:");
            int memory = input.nextInt();

            thisProduct = new SmartPhone(productName, productPrice, memory);
            products.add(thisProduct);

        } else if (productType.trim().toLowerCase().equals("t")) {
            System.out.println("Give width:");
            int h = input.nextInt();

            System.out.println("Give height:");
            int w = input.nextInt();

            thisProduct = new Television(productName, new int[] {w,h});
            products.add(thisProduct);

        } else if (productType.trim().toLowerCase().equals("h")) {
            System.out.println("Which color?");
            String color = input.nextLine();

            thisProduct = new Headphone(productName, color);
            products.add(thisProduct);
        }

        input.close();


        //Print the Cart
        printCart();

    }

    static public void printCart() {
        for (int i=0; i<products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }
}
