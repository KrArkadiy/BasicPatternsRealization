package main.java.base_patterns.creational.abstract_factory.pop_band;

import main.java.base_patterns.creational.abstract_factory.Drummer;
import main.java.base_patterns.creational.abstract_factory.Guitarist;
import main.java.base_patterns.creational.abstract_factory.MusicBandFactory;
import main.java.base_patterns.creational.abstract_factory.Singer;

public class PopBandFactory implements MusicBandFactory {
    @Override
    public Singer getSinger() {
        return new PopBandSinger();
    }

    @Override
    public Drummer getDrummer() {
        return new PopBandDrummer();
    }

    @Override
    public Guitarist getGuitarist() {
        return new PopBandGuitarist();
    }
}
