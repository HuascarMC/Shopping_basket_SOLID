package com.example.huascar.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by huascar on 02/12/2017.
 */

public class ShoppingBasket {

    private ArrayList<Item> basket;

    public ShoppingBasket() {
        this.basket = new ArrayList<>();
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

    public void clearBasket() {
        basket.clear();
    }

    public int TotalValue() {
        int total = 0;
        for (Item item : basket) {
            total += item.getPrice();
        }
        return total;
    }
}
