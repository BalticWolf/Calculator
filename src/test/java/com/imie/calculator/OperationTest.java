package com.imie.calculator;

import static org.junit.Assert.*;

public class OperationTest {

    private Operation operation;

    @org.junit.Before
    public void setUp() throws Exception {
        this.operation = new Operation();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        this.operation = null;
    }

    @org.junit.Test
    public void add() {
        assertNotNull(this.operation);
        assertEquals(3, this.operation.add(1, 2));
        assertEquals(-1, this.operation.add(1, -2));
    }

    @org.junit.Test
    public void subtract() {
        assertNotNull(this.operation);
        assertEquals(7, this.operation.subtract(10, 3));
        assertEquals(-6, this.operation.subtract(2, 8));
    }

    @org.junit.Test
    public void multiply() {
        assertNotNull(this.operation);
        assertEquals(0, this.operation.multiply(0, 3), 0);
        assertEquals(16, this.operation.multiply(2, 8), 0);
        assertEquals(-8, this.operation.multiply(-1, 8), 0);
        assertEquals(8, this.operation.multiply(-1, -8), 0);
    }

    @org.junit.Test
    public void divide() {
        assertNotNull(this.operation);
        assertEquals(0.0, this.operation.divide(0, 3), 0);
        assertEquals(4.0, this.operation.divide(8, 2), 0);
        assertEquals(-4.0, this.operation.divide(8, -2), 0);
        assertEquals(4.0, this.operation.divide(-8, -2), 0);
        assertEquals(0.5, this.operation.divide(4, 8), 0);
    }
}