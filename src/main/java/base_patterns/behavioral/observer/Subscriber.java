package main.java.base_patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> twits) {
        System.out.println("Dear " + name + " hurry up, new twit is out" + twits);
    }
}
