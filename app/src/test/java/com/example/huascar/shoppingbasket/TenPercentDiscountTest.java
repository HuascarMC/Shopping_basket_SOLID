package com.example.huascar.shoppingbasket;

import com.example.huascar.shoppingbasket.models.TenPercentDiscount;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by huascar on 02/12/2017.
 */

public class TenPercentDiscountTest {

    TenPercentDiscount discount;

    @Before
    public void before() {
        this.discount = new TenPercentDiscount();
    }

    @Test
    public void testDiscount() {
        double total = 10;
        assertEquals(9.0, discount.Discount(total));
    }

}
