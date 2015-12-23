package com.oca.studyguide.chapter1;

/**
 * Created by david.martins on 12/23/15.
 */
public class OrderOfInitExample {

// This code prints 5

    public OrderOfInitExample() {

        number = 5;
    }

    public static void main(String[] args) {

        OrderOfInitExample orderOfInitExample = new OrderOfInitExample();
        System.out.println(orderOfInitExample.number);

    }

    private int number = 3;

    {
        number = 4;
    }
}