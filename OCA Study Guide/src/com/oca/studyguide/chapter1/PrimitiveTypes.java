package com.oca.studyguide.chapter1;

/**
 * Created by davidmartins on 12/23/15.
 */
public class PrimitiveTypes {

    /*
     * Primitive types:
     * * boolean
     * * byte
     * * char
     * * short
     * * int
     * * long
     * * float
     * * double
     */

    private long max = 3123456789; // Does not compile: integer number too large. Although its marked as long...
    // By default, Java assumes you're defining an int as a literal!!

    private long newMax = 3123456789L; // This one works but it needs an L at the end...

    private int octal = 017; // This is an octal value because it starts with 0

    private int hex = 0xFF; // This is an hexadecimal value because it starts with 0x

    private int binary = 0b10; // This is a binary value because it starts with 0b

    private int oldMillion = 1000000; // One million in the old way
    private int newMillion = 1_000_000; // One million the new (Java 7) way
}
