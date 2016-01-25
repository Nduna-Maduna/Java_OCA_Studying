package com.oca.studyguide.chapter3;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        int[] numbers = {1, 13, 6, 9, -1, -167, 8, -20, 56};
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("");

        String[] numbersString = {"1", "10", "8", "90", "87", "12"};
        Arrays.sort(numbersString);

        for (String number : numbersString) {
            System.out.print(number + " ");
        }
    }
}
