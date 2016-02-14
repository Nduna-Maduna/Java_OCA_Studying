package com.oca.studyguide.chapter4;

public class Varargs {

    public static void main(String[] args) {

        walk(1);
        walk(1, 2);
        walk(1, 2, 3);
        walk(1, new int[] {4, 5, 6});
    }


    /*
     * Using varargs has to follow two simple rules:
     * 1. The varargs variable has to be the last parameter in the list parameter of a method.
     * 2. Only one vararg parameter per method is allowed.
     */
    public static void walk(int start, int... numbers) {
        System.out.println(numbers.length);
    }
}
