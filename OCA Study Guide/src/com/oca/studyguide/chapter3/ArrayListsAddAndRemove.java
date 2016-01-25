package com.oca.studyguide.chapter3;

import java.util.ArrayList;

public class ArrayListsAddAndRemove {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        System.out.println(arrayList.remove("two"));
        System.out.println(arrayList.remove("one"));
        System.out.println(arrayList.remove(0));
        System.out.println(arrayList.remove(4)); // Index out of bounds exception. Removing by index nr either returns
                                                 // the object being removed or busts :)
    }
}
