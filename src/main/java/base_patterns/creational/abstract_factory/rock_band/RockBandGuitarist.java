package main.java.base_patterns.creational.abstract_factory.rock_band;

import main.java.base_patterns.creational.abstract_factory.Guitarist;

public class RockBandGuitarist implements Guitarist {
    @Override
    public void playGuitar() {
        System.out.println("Guitarist playing electric guitar");
    }
}
