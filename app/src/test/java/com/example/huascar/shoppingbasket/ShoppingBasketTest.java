package com.example.huascar.shoppingbasket;

import com.example.huascar.shoppingbasket.models.Product;
import com.example.huascar.shoppingbasket.models.ShoppingBasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 02/12/2017.
 */

public class ShoppingBasketTest {

    ShoppingBasket shoppingBasket;
    Product milk;
    Product wine;
    Product steak;

    @Before
    public void before() {
        this.shoppingBasket = new ShoppingBasket();
        this.milk = new Product("milk", 3);
        this.wine = new Product("wine", 10);
        this.steak = new Product("steak", 8);
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
    public void testBuyOneGetFree() {
        shoppingBasket.addItem(steak);
        assertEquals(2, shoppingBasket.countItems());
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

    @Test
    public void testTotalValue() {
        shoppingBasket.addItem(milk);
        shoppingBasket.addItem(wine);
        assertEquals(13.0, shoppingBasket.TotalValue(false), 0.1);
    }
}
