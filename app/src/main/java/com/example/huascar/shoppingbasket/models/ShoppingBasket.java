package com.example.huascar.shoppingbasket.models;

import com.example.huascar.shoppingbasket.Interfaces.Item;

import java.util.ArrayList;

/**
 * Created by huascar on 02/12/2017.
 */
//The shopping basket will be filled with products,
//an item interface was created to prevent bad flow control.
//The single responsability principle leaves me with tons of classes, is that okay?

public class ShoppingBasket {

    //Why generic type needs to be declared here and not constructor.
    private ArrayList<Item> basket;

    public ShoppingBasket() {
        this.basket = new ArrayList<>();
    }

    public int countItems() {
        return basket.size();
    }

    public void addItem(Item item) {
        if (item.getOneFree() == true) {
            basket.add(item);
        }
        basket.add(item);
    }

    public void removeitem(Item item) {
        basket.remove(item);
    }

    public void clearBasket() {
        basket.clear();
    }

    public double TotalValue() {
        double total = 0;
            for (Item item : basket) {
                total += item.getPrice();
            }
        return total;
    }
}

//     for (Item item : basket) {
//             total += item.getPrice();
//             }
//             if (total > 20) {
//             double discount = (total*10)/100;
//             total = total - discount;
//             if (loyaltyCard == true) {
//             total =
//             }
//             }
