package com.imie.calculator;

import static org.junit.Assert.assertEquals;

public class OperationTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void add() {
        assertEquals(3, Operation.add(1, 2));
        assertEquals(-1, Operation.add(1, -2));
    }

    @org.junit.Test
    public void subtract() {
        assertEquals(7, Operation.subtract(10, 3));
        assertEquals(-6, Operation.subtract(2, 8));
    }

    @org.junit.Test
    public void multiply() {
        assertEquals(0, Operation.multiply(0, 3), 0);
        assertEquals(16, Operation.multiply(2, 8), 0);
        assertEquals(-8, Operation.multiply(-1, 8), 0);
        assertEquals(8, Operation.multiply(-1, -8), 0);
    }

    @org.junit.Test
    public void divide() {
        assertEquals(0.0, Operation.divide(0, 3), 0);
        assertEquals(4.0, Operation.divide(8, 2), 0);
        assertEquals(-4.0, Operation.divide(8, -2), 0);
        assertEquals(4.0, Operation.divide(-8, -2), 0);
        assertEquals(0.5, Operation.divide(4, 8), 0);
        assertEquals(Integer.MIN_VALUE, Operation.divide(5, 0), 0);
    }
}
