package main.java.base_patterns.creational.abstract_factory;

import main.java.base_patterns.creational.abstract_factory.pop_band.PopBandFactory;
import main.java.base_patterns.creational.abstract_factory.rock_band.RockBandFactory;

public class PerfectMusicBand {
    public static void main(String[] args) {
        MusicBandFactory musicBandFactory = new PopBandFactory();
        Singer singer = musicBandFactory.getSinger();
        Drummer drummer = musicBandFactory.getDrummer();
        Guitarist guitarist = musicBandFactory.getGuitarist();

        System.out.println("Creating music band...");
        singer.sing();
        drummer.playDrums();
        guitarist.playGuitar();

        System.out.println();

        MusicBandFactory musicBandFactory1 = new RockBandFactory();
        Singer singer1 = musicBandFactory1.getSinger();
        Drummer drummer1 = musicBandFactory1.getDrummer();
        Guitarist guitarist1 = musicBandFactory1.getGuitarist();

        System.out.println("Creating music band...");
        singer1.sing();
        drummer1.playDrums();
        guitarist1.playGuitar();
    }
}
