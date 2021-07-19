package main.java.base_patterns.creational.factory;

public class ElectricGuitarGuitaristFactory implements GuitaristFactory{
    @Override
    public Guitarist createGuitarist() {
        return new ElectricGuitarGuitarist();
    }
}
