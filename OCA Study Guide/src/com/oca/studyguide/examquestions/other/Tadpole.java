package com.oca.studyguide.examquestions.other;

import com.oca.studyguide.examquestions.animal.Frog;

import java.util.ArrayList;
import java.util.List;

public class Tadpole extends Frog {

    public int Tadpole() { return 0; }

    public Tadpole() {}

    public void callIt() {}

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("meow");
        StringBuilder s2 = new StringBuilder("meow");

        if (s1 == s2) System.out.println("one");
        if (s1.equals(s2)) System.out.println("two");
        if (s1.toString() == "meow") System.out.println("four");
    }
}
