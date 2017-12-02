package com.example.huascar.shoppingbasket;

import com.example.huascar.shoppingbasket.models.BasketCalculator;
import com.example.huascar.shoppingbasket.models.Product;
import com.example.huascar.shoppingbasket.models.ShoppingBasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 02/12/2017.
 */

public class BasketCalculatorTest {

    BasketCalculator calculator;
    ShoppingBasket basket;
    Product milk;
    Product wine;
    Product steak;

    @Before
    public void testBasketCalculator() {
        this.calculator = new BasketCalculator();
        this.basket = new ShoppingBasket();
        this.milk = new Product("milk", 3, false);
        this.wine = new Product("wine", 10, false);
        this.steak = new Product("steak", 8, true);
    }

    @Test
    public void testCalculate() {
        this.basket.addItem(milk);
        this.basket.addItem(wine);
        this.basket.addItem(steak);
        assertEquals(25.57, calculator.Calculate(basket), 0.01);
    }
}
