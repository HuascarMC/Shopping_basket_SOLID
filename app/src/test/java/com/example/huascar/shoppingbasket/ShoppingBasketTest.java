package com.example.huascar.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 02/12/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Product milk;

    @Before
    public void before() {
        this.shoppingBasket = new ShoppingBasket();
        this.milk = new Product();
    }

    @Test
    public void testCountItems() {
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void testAddItem() {
        shoppingBasket.addItem(milk);
        assertEquals(1, shoppingBasket.countItems());
    }

    @Test
    public void testRemoveItem() {
        shoppingBasket.addItem(milk);
        shoppingBasket.removeitem(milk);
        assertEquals(0, shoppingBasket.countItems());
    }

    @Test
    public void testClearBasket() {
        shoppingBasket.addItem(milk);
        shoppingBasket.clearBasket();
        assertEquals(0, shoppingBasket.countItems());
    }
}
