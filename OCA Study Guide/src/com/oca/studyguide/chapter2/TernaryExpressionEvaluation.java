package com.oca.studyguide.chapter2;

public class TernaryExpressionEvaluation {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        final int c = a < 10 ? a++ : b++;

        System.out.println(a+","+b);

        int y = 1;
        int z = 1;
        final int x = y >= 10 ? y++ : z++;

        System.out.println(y+","+z);

        // Only one expression is evaluated, ever!!! The one that satisfies the condition.
    }
}
