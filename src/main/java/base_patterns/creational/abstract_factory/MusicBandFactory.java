package main.java.base_patterns.creational.abstract_factory;

public interface MusicBandFactory {
    Singer getSinger();
    Drummer getDrummer();
    Guitarist getGuitarist();
}
