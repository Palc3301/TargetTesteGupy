package org.target;

import org.junit.Assert;
import org.junit.Test;

public class Question2Test {

    @Test
    public void testIsFibonacci() {
        Assert.assertTrue(Question2.isFibonacci(0));
        Assert.assertTrue(Question2.isFibonacci(1));
        Assert.assertTrue(Question2.isFibonacci(2));
        Assert.assertTrue(Question2.isFibonacci(3));
        Assert.assertTrue(Question2.isFibonacci(5));
        Assert.assertTrue(Question2.isFibonacci(8));
        Assert.assertTrue(Question2.isFibonacci(433494437));
        Assert.assertFalse(Question2.isFibonacci(4));
        Assert.assertFalse(Question2.isFibonacci(6));
        Assert.assertFalse(Question2.isFibonacci(7));
    }
}