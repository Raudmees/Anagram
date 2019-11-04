package com.kaurkaitsa;

import java.util.ArrayList;

public class Influencer implements Observable1 {


    @Override
    public void notify1() {
            for(Observer1 obs : observer1s){
                obs.update();
            }
    }

    private void writeMessage (String msg){

        System.out.println(msg);

    }

    @Override
    public void addObserver(Observer1 id) {
            observer1s.add(id);
    }

    @Override
    public void removeObserver(Observer1 id) {
        observer1s.remove(id);

    }

    private ArrayList<Observer1>observer1s = new ArrayList <Observer1>();



}
