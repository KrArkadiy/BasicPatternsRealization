package main.java.base_patterns.structural.composite;

public class FrenchCarPlant implements CarPlant{
    @Override
    public void constructCar() {
        System.out.println("Constructing French cars: PEUGEOT, CITROEN");
    }
}
