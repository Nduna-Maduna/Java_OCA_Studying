package com.oca.studyguide.chapter3;

import java.util.Arrays;

public class ArraySearching {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1 -> If existed it should stay in position 0 of the array
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2 -> If existed it should stay in position 1 of the array
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5 -> If existed it should stay in position 4 of the array
        System.out.println(Arrays.binarySearch(numbers, 122)); // -5 -> If existed it should stay in position 4 of the array

        // When the number does not exist in the array the returned result is the negative index minus 1 on which that
        // number should exist in the array, case it would exist
    }
}
