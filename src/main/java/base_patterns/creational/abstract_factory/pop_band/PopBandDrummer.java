package main.java.base_patterns.creational.abstract_factory.pop_band;

import main.java.base_patterns.creational.abstract_factory.Drummer;

public class PopBandDrummer implements Drummer {
    @Override
    public void playDrums() {
        System.out.println("Oops... There is no drummer in pop band");
    }
}
