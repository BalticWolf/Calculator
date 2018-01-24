package com.imie.calculator;

public class Operation {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return add(a, -b);
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return multiply(a, 1 / b);
    }
}
