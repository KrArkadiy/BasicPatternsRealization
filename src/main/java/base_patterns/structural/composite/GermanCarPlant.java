package main.java.base_patterns.structural.composite;

public class GermanCarPlant implements CarPlant{
    @Override
    public void constructCar() {
        System.out.println("Constructing German cars: BMW, AUDI.");
    }
}
