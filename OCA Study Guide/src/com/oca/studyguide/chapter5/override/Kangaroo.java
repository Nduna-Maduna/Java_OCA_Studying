package com.oca.studyguide.chapter5.override;


public class Kangaroo extends Marsupial {

    public boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {

        System.out.println("Kangaroo hops on two legs? " + isBiped()); // isBiped is overriden in this class
    }

    public static void main(String[] args) {

        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();

        Marsupial karl = new Marsupial();
        karl.getMarsupialDescription();
    }
}

