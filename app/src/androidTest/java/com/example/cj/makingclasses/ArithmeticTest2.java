package com.example.cj.makingclasses;
import junit.framework.TestCase;

/**
 * Created by CJ on 11/30/2017.
 */

/**
 * Created by wdumas on 2/24/2015.
 */
public class ArithmeticTest2 extends TestCase {

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic(5, 10);
    }

    public void testArithmeticAdd() {
        assertEquals(Arithmetic.add(2, 2), 4);
        assertEquals(Arithmetic.add(2, -5), -3);
    }

    public void testArithmeticSubtract() {
        assertEquals(a.subtract(), -5);
    }

    public void testArithmeticMultiply() {
        assertEquals(a.multiply(), 50);
    }

    public void testArithmeticDivide() {
        assertEquals(a.divide(), 0.5);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}