package com.oca.studyguide.chapter5.hide;

public class Bat extends Mammal {

    public static boolean canFly() {
        return true;
    }

    public void getBatDescription() {
        System.out.println("Can a bat fly? " + canFly());
    }

    public static void main(String[] args) {
        Bat batman = new Bat();
        batman.getBatDescription();
        batman.getMammalDescription();
    }
}
