package com.oca.studyguide.chapter1;

public class VariableInitialization {

    public void findAnswer(boolean check) {

        int answer;
        int onlyOneBranch;

        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }

        System.out.println(answer);
        //System.out.println(onlyOneBranch); // Does not compile because this variable may never be initialized
    }

    public static void main(String[] args) {

        VariableInitialization variableInitialization = new VariableInitialization();

        variableInitialization.findAnswer(false);

    }
}
