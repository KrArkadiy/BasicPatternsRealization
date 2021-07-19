package main.java.base_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class WorldCarIndustry implements CarPlant{
        List<CarPlant> carPlants = new ArrayList<>();

        public void addCarPlant(CarPlant carPlant){
            System.out.println("New Car plant is opened");
            carPlants.add(carPlant);
        }

        public void removeCarPlant(CarPlant carPlant){
            System.out.println("Car plant is closed");
            carPlants.remove(carPlant);
        }

    @Override
    public void constructCar() {
        System.out.println("World car industry is functioning..\n ");
        for(CarPlant carPlant : carPlants){
            carPlant.constructCar();
    }
}
}
