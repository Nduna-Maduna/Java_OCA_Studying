package com.oca.studyguide.chapter1;

/**
 * Created by david.martins on 12/23/15.
 */
public class OrderOfInitialization {

    // Fields and blocks are first
    // Fields and instance initializer blocks are run in the order in which they appear in the file
    // The constructor runs after all fields and instance initializer blocks have run
    // Order matters for the fields and blocks of code

    private String name = "Fluffy";

    {
        System.out.println("Setting field.");
    }

    public OrderOfInitialization() {

        this.name = "Tiny";
        System.out.println("Setting constructor.");
    }

    public static void main(String[] args) {

        OrderOfInitialization orderOfInitialization = new OrderOfInitialization();

        System.out.println(orderOfInitialization.name);
    }
}
