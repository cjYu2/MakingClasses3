package com.example.cj.makingclasses;
import junit.framework.TestCase;
/**
 * Created by CJ on 11/30/2017.
 */

public class ArithmeticTest extends TestCase{

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();
    }

    public void testArithmeticAdd() {
        assertEquals(a.add(), 5);
    }

    public void testArithmeticSubtract() {
        assertEquals(a.subtract(), -1);
    }

    public void testArithmeticDivide() {
        assertEquals(a.divide(), 2/3);
    }

    public void testArithmeticMultiply() {
        assertEquals(a.multiply(), 6);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}