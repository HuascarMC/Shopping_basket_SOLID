package com.example.huascar.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by huascar on 02/12/2017.
 */

public class ShoppingBasket {

    private ArrayList basket;

    public ShoppingBasket() {
        this.basket = new ArrayList<Item>();
    }

    public int countItems() {
        return basket.size();
    }

    public void addItem(Item item) {
        basket.add(item);
    }

    public void removeitem(Item item) {
        basket.remove(item);
    }
}
