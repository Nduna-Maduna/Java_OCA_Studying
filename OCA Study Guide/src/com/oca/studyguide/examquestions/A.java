/* A class example of try catch finally logic */

package com.oca.studyguide.examquestions;

public class A {

    private String value;

    public void go() {
        try {
            System.out.println(value.toString());
            System.out.println("1");
        } catch (NullPointerException e) {
            System.out.println("2");
            System.exit(0);
        } finally {
            System.out.println("3");
        }
        System.out.println("4");
    }

    public static void main(String[] args) {
        new A().go();
    }
}
