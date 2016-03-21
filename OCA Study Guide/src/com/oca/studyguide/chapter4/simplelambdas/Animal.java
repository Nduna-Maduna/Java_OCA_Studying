package com.oca.studyguide.chapter4.simplelambdas;

public class Animal {

    private String species;
    private boolean canSwim;
    private boolean canHop;

    public Animal(String species, boolean canSwim, boolean canHop) {
        this.species = species;
        this.canSwim = canSwim;
        this.canHop = canHop;
    }

    public boolean canSwim() {
        return this.canSwim;
    }

    public boolean canHop() {
        return this.canHop;
    }

    public String toString() {
        return this.species;
    }
}
