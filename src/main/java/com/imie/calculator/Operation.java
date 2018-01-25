package com.imie.calculator;

/**
 * This class defines the 4 usual operations
 */
public class Operation {

    public Operation() {}

    /**
     * @param a: first integer operand
     * @param b: second integer operand
     * @return a plus b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * @param a: first integer operand
     * @param b: second integer operand
     * @return a minus b
     */
    public int subtract(int a, int b) {
        return add(a, -b);
    }

    /**
     * @param a: first float operand
     * @param b: second float operand
     * @return a multiplied by b
     */
    public float multiply(float a, float b) {
        return a * b;
    }

    /**
     * @param a: first float operand
     * @param b: second float operand
     * @return a divided by b
     */
    public float divide(float a, float b) {
        return multiply(a, 1 / b);
    }
}
