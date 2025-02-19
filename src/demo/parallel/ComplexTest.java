package demo.parallel;

import org.junit.Test;
import org.junit.Assert;

public class ComplexTest {
    @Test
    public void div() {
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);
        Complex c = new Complex(0.45, 0.08);
        a = a.divide(b);
        Assert.assertTrue(c.getRe() == a.getRe());
        Assert.assertTrue(c.getIm() == a.getIm());
    }

    @Test
    public void minusNegative() {
        Complex a = new Complex(1,2);
        Complex b = new Complex(3,4);
        Complex c = new Complex(-2, -2);
        a = a.minus(b);
        Assert.assertTrue(c.getRe() == a.getRe());
        Assert.assertTrue(c.getIm() == a.getIm());
    }

    @Test
    public void minusPositive() {
        Complex a = new Complex(5,5);
        Complex b = new Complex(2,2);
        Complex c = new Complex(3, 3);
        a = a.minus(b);
        Assert.assertTrue(c.getRe() != a.getRe());
        Assert.assertTrue(c.getIm() != a.getIm());
    }
}

