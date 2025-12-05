package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;


public class SmartPhone extends Prodotto{

    protected long IMEI;
    protected int memoryGB;

    //Constructors
    public SmartPhone(String name, BigDecimal price, int memoryGB) {
        super(name, price);
        this.IMEI = generateIMEI();
        this.memoryGB = memoryGB;
    }

    public SmartPhone() {
        this("", new BigDecimal(0) , 16);
    }

    public SmartPhone(String name, int memoryGB) {
        this(name, new BigDecimal(0) , memoryGB);
    }

    public SmartPhone(int memoryGB) {
        this("", new BigDecimal(0), memoryGB);
    }

    //helper method to generate IMEI code
    private long generateIMEI() {
        return (new Random()).nextLong(100000000000000L, 999999999999999L);
    }

    @Override
    public String toString() {
        return String.format("%s" + "-" + "%s" + "GB", super.toString(), this.memoryGB);
    }


    
}