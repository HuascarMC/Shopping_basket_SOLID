package com.example.huascar.shoppingbasket.models;

/**
 * Created by huascar on 02/12/2017.
 */

public class BasketCalculator {

    LoyaltyDiscount loyalty;
    TenPercentDiscount discount;

    public double Calculate(ShoppingBasket basket) {
        double result = 0;
        double total = basket.TotalValue();
        total -= discount.Discount(total);
        result = total - loyalty.Discount(total);
        return result;

    }
}
