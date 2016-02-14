package com.oca.studyguide.chapter4;

public class DataAmongMethods {

    public static void main1(String[] args) {

        String name = "Webby";

        speak1(name);

        System.out.println(name);
    }

    public static void speak1(String name) {
        name = "Saparky";
    }

    public static void main(String[] args) {

        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name);
    }

    public static void speak(StringBuilder name) {
        name.append("WEbby");
    }

    // Assigning a new primitive or reference to a parameter doesn't change the caller. Calling methods on a reference
    // to an object does affect the caller.
}
