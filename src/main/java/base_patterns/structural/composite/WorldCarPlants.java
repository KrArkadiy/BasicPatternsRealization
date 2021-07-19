package main.java.base_patterns.structural.composite;

public class WorldCarPlants {
    public static void main(String[] args) {
        WorldCarIndustry worldCarIndustry = new WorldCarIndustry();

        CarPlant germanCarPlant = new GermanCarPlant();
        CarPlant frenchCarPlant = new FrenchCarPlant();

        worldCarIndustry.addCarPlant(germanCarPlant);
        worldCarIndustry.addCarPlant(frenchCarPlant);

        worldCarIndustry.constructCar();

    }
}
