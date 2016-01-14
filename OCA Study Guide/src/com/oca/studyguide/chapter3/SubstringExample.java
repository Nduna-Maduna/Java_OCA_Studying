package com.oca.studyguide.chapter3;

public class SubstringExample {

    public static void main(String[] args) {

        String string = "animals";

        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf("m"))); // mals
        System.out.println(string.substring(3, 4)); // m -> this stops just before position 4
        System.out.println(string.substring(3, 7)); // mals -> position 7 is the EOF for the string
        System.out.println(string.substring(3, 3)); // empty string
        //System.out.println(string.substring(3, 2)); // exception: string index out of bounds exception
        System.out.println(string.substring(3, 8)); // exception: string index out of range: 8
    }

}
