package com.example.huascar.shoppingbasket;

/**
 * Created by huascar on 02/12/2017.
 */

public class Product implements Item {

    private String name;
    private int price;
    private boolean oneFree;

    public Product(String name, int price, boolean oneFree) {
        this.name = name;
        this.price = price;
        this.oneFree = oneFree;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean getOneFree() {
        return oneFree;
    }
}
