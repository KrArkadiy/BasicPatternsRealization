package main.java.base_patterns.creational.abstract_factory.pop_band;

import main.java.base_patterns.creational.abstract_factory.Singer;

public class PopBandSinger implements Singer {
    @Override
    public void sing() {
        System.out.println("Pop band front-man sings songs");
    }
}
