package main.java.base_patterns.creational.abstract_factory.rock_band;

import main.java.base_patterns.creational.abstract_factory.Drummer;

public class RockBandDrummer implements Drummer {
    @Override
    public void playDrums() {
        System.out.println("Drummer playing drums");
    }
}
