package main.java.base_patterns.creational.abstract_factory.rock_band;

import main.java.base_patterns.creational.abstract_factory.Drummer;
import main.java.base_patterns.creational.abstract_factory.Guitarist;
import main.java.base_patterns.creational.abstract_factory.MusicBandFactory;
import main.java.base_patterns.creational.abstract_factory.Singer;

public class RockBandFactory implements MusicBandFactory {
    @Override
    public Singer getSinger() {
        return new RockBandSinger();
    }

    @Override
    public Drummer getDrummer() {
        return new RockBandDrummer();
    }

    @Override
    public Guitarist getGuitarist() {
        return new RockBandGuitarist();
    }
}
