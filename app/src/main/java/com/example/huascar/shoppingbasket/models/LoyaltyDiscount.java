package com.example.huascar.shoppingbasket.models;

import com.example.huascar.shoppingbasket.Interfaces.Discount;

/**
 * Created by huascar on 02/12/2017.
 */

public class LoyaltyDiscount implements Discount {

    public int Discount(int total) {
        int result = total - (total*2)/100;
        return result;
    }
}
