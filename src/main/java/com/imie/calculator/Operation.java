package com.imie.calculator;

/**
 * This class defines the 4 usual operations.
 */
public final class Operation {

    /**
     * Constructor.
     */
    private Operation() {
        // prevents calls from subclass
    }

    /**
     * @param a first integer operand
     * @param b second integer operand
     * @return a plus b
     */
    public static int add(final int a, final int b) {
        return a + b;
    }

    /**
     * @param a first integer operand
     * @param b second integer operand
     * @return a minus b
     */
    public static int subtract(final int a, final int b) {
        return add(a, -b);
    }

    /**
     * @param a first float operand
     * @param b second float operand
     * @return a multiplied by b
     */
    public static float multiply(final float a, final float b) {
        return a * b;
    }

    /**
     * @param a first float operand
     * @param b second float operand
     * @return a divided by b
     */
    public static float divide(final float a, final float b) {
        float result;
        if (b == 0) {
            result = Integer.MIN_VALUE;
        } else {
            result = multiply(a, 1 / b);
        }
        return result;
    }
}
