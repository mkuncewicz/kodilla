package com.kodilla.exception.test;

public class ExceptionHandling {


    public void secondChallenge() {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String string = secondChallenge.probablyIWillThrowException(1.5, 4);
            System.out.println(string);
        } catch (Exception e) {
            System.out.println("BLAD BQ !: " + e);
        }
    }
}
