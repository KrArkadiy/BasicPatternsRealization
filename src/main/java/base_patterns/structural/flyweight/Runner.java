package main.java.base_patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        List<Car> cars = new ArrayList<>();

        cars.add(carFactory.getCarByTransmission("auto"));
        cars.add(carFactory.getCarByTransmission("auto"));
        cars.add(carFactory.getCarByTransmission("auto"));
        cars.add(carFactory.getCarByTransmission("auto"));
        cars.add(carFactory.getCarByTransmission("auto"));
        cars.add(carFactory.getCarByTransmission("auto"));
        cars.add(carFactory.getCarByTransmission("mechanical"));

        for(Car car : cars){
            car.drive();
        }
    }
}
