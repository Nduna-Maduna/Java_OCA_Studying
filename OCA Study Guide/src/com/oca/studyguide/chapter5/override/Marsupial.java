package com.oca.studyguide.chapter5.override;

public class Marsupial {

    public boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs? " + isBiped());

    }
}