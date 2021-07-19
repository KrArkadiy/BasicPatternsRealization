package main.java.base_patterns.creational.factory;

public class BandOfGuitarists {
    public static void main(String[] args) {
        GuitaristFactory guitaristFactory = new ElectricGuitarGuitaristFactory();
        Guitarist guitarist = guitaristFactory.createGuitarist();
        guitarist.playGuitar();

        System.out.println();

        GuitaristFactory guitaristFactory1 = new BassGuitarGuitaristFactory();
        Guitarist guitarist1 = guitaristFactory1.createGuitarist();
        guitarist1.playGuitar();


    }
}
