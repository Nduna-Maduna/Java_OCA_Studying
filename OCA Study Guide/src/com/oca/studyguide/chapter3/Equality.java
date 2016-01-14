package com.oca.studyguide.chapter3;

/**
 * @author davidmartins
 */
public class Equality {

    public static void main(String[] args) {

        // 1. StringBuilder equality

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");

        System.out.println(one == two);
        System.out.println(one == three); // since they are the same object, == is true

        // 2. String equality

        String x = "Hello World";
        String z = "Hello World";

        System.out.println(x == z); // true because strings are immutable and (in this case) literals are pooled

        // 3. Strings at runtime

        String a = "Hello World";
        String b = " Hello World".trim();

        System.out.println(a == b); // false because string b is computed at runtime, making it a different string even

        // 4. Explicit String objects

        String c = new String("Hello World");
        String d = "Hello World";

        System.out.println(c == d); // false because there is an explicit request for a different String object
    }
}