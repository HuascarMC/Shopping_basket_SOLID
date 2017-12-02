package com.example.huascar.shoppingbasket;

import com.example.huascar.shoppingbasket.models.BasketCalculator;

import org.junit.Before;

/**
 * Created by huascar on 02/12/2017.
 */

public class BasketCalculatorTest {

    BasketCalculator calculator;

    @Before
    public void testBasketCalculator() {
        this.calculator = new BasketCalculator();
    }
}
