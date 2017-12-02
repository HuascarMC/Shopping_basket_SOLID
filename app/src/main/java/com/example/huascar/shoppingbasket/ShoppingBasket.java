package com.example.huascar.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by huascar on 02/12/2017.
 */

public class ShoppingBasket {

    private ArrayList basket;

    public ShoppingBasket() {
        ArrayList<Item> basket = new ArrayList<>();
    }

    public int countItems() {
        return basket.size();
    }
}
