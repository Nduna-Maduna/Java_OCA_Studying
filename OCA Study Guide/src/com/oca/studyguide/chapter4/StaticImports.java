package com.oca.studyguide.chapter4;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class StaticImports {

    public static void main(String[] args) {

        System.out.println(Arrays.asList(124, 4));
        System.out.println(asList(1, 2, 4));
    }
    // It can use a static import an a normal import of basically the same thing. So we can use it however we want.
}
