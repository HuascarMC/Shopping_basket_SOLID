package com.example.huascar.shoppingbasket.models;

import com.example.huascar.shoppingbasket.Interfaces.Discount;

/**
 * Created by huascar on 02/12/2017.
 */

public class TenPercentDiscount implements Discount {

    public double Discount(double total) {
        double result = ((total*10)/100);
        return result;
    }
}
