package com.kaurkaitsa;

public class Subscriber implements Observer1 {
    @Override
    public void subscriber(Observable1 ops) {

    }

    @Override
    public void unsubscribe(Observable1 ops) {

    }

    @Override
    public void update() {

        System.out.println("I got a new msg");

    }
}
