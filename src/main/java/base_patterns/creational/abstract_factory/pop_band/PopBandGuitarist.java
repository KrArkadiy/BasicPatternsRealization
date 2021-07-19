package main.java.base_patterns.creational.abstract_factory.pop_band;

import main.java.base_patterns.creational.abstract_factory.Guitarist;

public class PopBandGuitarist implements Guitarist {
    @Override
    public void playGuitar() {
        System.out.println("Guitarist playing electric guitar");
    }
}
