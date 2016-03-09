package com.oca.studyguide.chapter5.hide;

public class Mammal {

    public static boolean canFly() {
        return false;
    }

    public void getMammalDescription() {
        System.out.println("A mammal can fly? " + canFly());
    }
}
