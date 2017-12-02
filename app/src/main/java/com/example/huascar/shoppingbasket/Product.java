package com.example.huascar.shoppingbasket;

/**
 * Created by huascar on 02/12/2017.
 */

public class Product implements Item {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
