package com.oca.studyguide.chapter2;

public class NumericPromotion {

    /*
     * 1. If two values have different data types, one will be promoted to the larger of the two.
     * 2. If one value is integral and another is floating point, the integral will be promoted to floating point.
     * 3. Byte, char and short are ALWAYS first promoted to int before they are used in an arithmetic operation.
     * 4. The resulting value is of the same data type as of the promoted operands.
     */

    public static void main(String[] args) {

        int x = 1;
        long y = 33;
        // x * y results in a long.

        System.out.println(y * x);

        double a = 39.21;
        float b = 2.1f; // Without an f at the end, Java will always assume the floating point value is a double

        System.out.println(a * b); // results in a double
    }
}
