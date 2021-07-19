package main.java.base_patterns.creational.abstract_factory.rock_band;

import main.java.base_patterns.creational.abstract_factory.Singer;

public class RockBandSinger implements Singer {
    @Override
    public void sing() {
        System.out.println("Rock band front-man sings rock songs");
    }
}
