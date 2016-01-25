package com.oca.studyguide.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);

        System.out.println(numbers); // The result is actually [1] because we are removing the index one here and not
                                     // the value 1 from the list
    }
}
