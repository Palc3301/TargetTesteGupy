package org.target;
import org.junit.Assert;
import org.junit.Test;

public class Question5Test {

    @Test
    public void testInvertString() {
        Assert.assertEquals("cba", Question5.invertString("abc"));
        Assert.assertEquals("54321", Question5.invertString("12345"));
        Assert.assertEquals("", Question5.invertString(""));
        Assert.assertEquals("a", Question5.invertString("a"));
        Assert.assertEquals("ovo", Question5.invertString("ovo"));
        Assert.assertEquals(" ba ", Question5.invertString(" ab "));
        Assert.assertEquals("!@#$%^&()", Question5.invertString(")(&^%$#@!"));
        Assert.assertEquals("aBcDeF", Question5.invertString("FeDcBa"));
    }

    @Test(expected = NullPointerException.class)
    public void testInvertStringWithNull() {
        Question5.invertString(null);
    }
}