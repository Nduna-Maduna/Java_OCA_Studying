package com.oca.studyguide.chapter4;

public class OrderOfInitialization {

    static { add(2); }

    static void add(int num) {
        System.out.print(num + " ");
    }

    OrderOfInitialization() { add(5); } // Constructor is the last element initialized no matter from where it is called

    static { add(4); }

    { add(6); }

    static { new OrderOfInitialization(); }

    { add(8); }

    public static void main(String[] args) {

    }
}
