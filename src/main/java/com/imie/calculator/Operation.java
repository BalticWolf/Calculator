package com.imie.calculator;

/**
 * This class defines the 4 usual operations.
 */
public abstract class Operation {

    /**
     * @param a: first integer operand
     * @param b: second integer operand
     * @return a plus b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * @param a: first integer operand
     * @param b: second integer operand
     * @return a minus b
     */
    public static int subtract(int a, int b) {
        return add(a, -b);
    }

    /**
     * @param a: first float operand
     * @param b: second float operand
     * @return a multiplied by b
     */
    public static float multiply(float a, float b) {
        return a * b;
    }

    /**
     * @param a: first float operand
     * @param b: second float operand
     * @return a divided by b
     */
    public static float divide(float a, float b) {
        return multiply(a, 1 / b);
    }
}
