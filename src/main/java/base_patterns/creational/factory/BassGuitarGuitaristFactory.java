package main.java.base_patterns.creational.factory;

public class BassGuitarGuitaristFactory implements GuitaristFactory{

    @Override
    public Guitarist createGuitarist() {
        return new BassGuitarGuitarist();
    }
}
