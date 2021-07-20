package main.java.base_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class RockBandTwitter implements Observed{
    List<String> twits = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addTwit(String twit){
        this.twits.add(twit);
        notifyObservers();
    }

    public void removeTwit(String twit){
        this.twits.remove(twit);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : subscribers){
            observer.handleEvent(this.twits);
        }
    }
}
