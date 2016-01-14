package com.oca.studyguide.chapter3;

public class StringBuilderChain {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");

        StringBuilder same = sb.append("+end"); // sb is added end and then sb and same will point to the same thing

        System.out.println("sb = " + sb);
        System.out.println("same = " + same);

        // Second example
        //
        // There is only one string builder here because there is only one new StringBuilder calling

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");

        b = b.append("f").append("g");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
