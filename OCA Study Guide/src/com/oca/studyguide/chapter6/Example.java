package com.oca.studyguide.chapter6;

public class Example {

    public static void main(String[] args) {

        System.out.print("a");

        try {
            System.out.print("b");

            i();

            throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {

            System.out.print("c");

            throw new RuntimeException("1");

        } catch (RuntimeException e) {

            System.out.print("d");

            throw new RuntimeException("2");

        } finally {
            System.out.print("e");
            throw new RuntimeException("3");
        }
    }


    public static void i() {

        int[] nums = new int[] {1, 2, 3};
        Object p = nums;
        int[] two = (int[]) p;
        System.out.println(10 / two[2]);

        boolean x = true;


        StringBuilder f = new StringBuilder("a");
        StringBuilder g = new StringBuilder("a");

        if (f.equals(g)) System.out.println("This sucs");
        else System.out.println("this not surck");
    }
}
