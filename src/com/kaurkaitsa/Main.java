package com.kaurkaitsa;



public class Main {

    public static void main(String[] args) {

            Influencer inf = new Influencer();
            Subscriber sub = new Subscriber();

            inf.addObserver(sub);
            inf.notify1();

    }



}


