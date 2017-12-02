package com.example.huascar.shoppingbasket.models;

/**
 * Created by huascar on 02/12/2017.
 */

public class BasketCalculator {

    LoyaltyDiscount loyalty = new LoyaltyDiscount();
    TenPercentDiscount tenDiscount = new TenPercentDiscount();

    public double Calculate(ShoppingBasket basket) {
        double total = basket.TotalValue();
        total -= tenDiscount.Discount(total);
        total -= loyalty.Discount(total);
        System.out.print(total);
        return total;
    }
}
