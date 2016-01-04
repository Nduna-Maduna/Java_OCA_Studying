package com.oca.studyguide.chapter2;

public class UnaryOperators {

    public static void main(String[] args) {

        // Apparently pre-unary and post-unary operators have the same precedence level

        int x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
