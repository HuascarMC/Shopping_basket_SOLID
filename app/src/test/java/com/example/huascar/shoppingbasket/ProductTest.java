package com.example.huascar.shoppingbasket;

import com.example.huascar.shoppingbasket.models.Product;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 02/12/2017.
 */

public class ProductTest {

    Product product;

    @Before
    public void before() {
        this.product = new Product("Product", 0, false);
    }

    @Test
    public void testGetName() {
        assertEquals("Product", product.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(0, product.getPrice());
    }
}
