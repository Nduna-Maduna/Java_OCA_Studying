package com.oca.studyguide.chapter4.simplelambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Fish", true, false));
        animals.add(new Animal("Kangaroo", false, true));
        animals.add(new Animal("Rabbit", false, true));
        animals.add(new Animal("Turtle", true, false));

        System.out.println("What animals can hop?");
        print(animals, animal -> animal.canHop());

        System.out.println("What animals can swim?");
        print(animals, animal -> animal.canSwim());
    }

    public static void print(List<Animal> animals, Predicate<Animal> checkTrait) {

        animals.forEach(a -> { if (checkTrait.test(a)) System.out.print(a + " "); });

        System.out.println();
    }
}
