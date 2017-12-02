package com.example.huascar.shoppingbasket;

import com.example.huascar.shoppingbasket.models.LoyaltyDiscount;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 02/12/2017.
 */

public class LoyaltyDiscountTest {

    LoyaltyDiscount discount;

    @Before
    public void before() {
        this.discount = new LoyaltyDiscount();
    }

    @Test
    public void testLoyaltyDiscount() {
        double total = 10;
        assertEquals(9.8, discount.Discount(10));
    }
}
