package org.lessons.java.shop;

import java.math.BigDecimal;

public class Television extends Prodotto{
    private int[] dimensionWH;
    private boolean isSmart;


    public Television(String name, BigDecimal price, int[] dimensionWH, boolean isSmart) {
        super(name, price);
        this.dimensionWH = dimensionWH;
        this.isSmart = isSmart;
    }

    public Television() {
        this("", new BigDecimal(0), new int[2], false);
    }

    public int[] getDims() {
        return this.dimensionWH;
    }
    public boolean getIsSmart() {
        return this.isSmart;
    }
}
