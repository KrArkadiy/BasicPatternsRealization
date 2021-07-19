package main.java.base_patterns.structural.bridge;

public class CarCreation {
    public static void main(String[] args) {
        Car[] cars = {
                new GermanCar(new BlackColor()),
                new RussianCar(new RedColor())
        };

        for(Car car : cars){
            car.drive();
        }
    }
}
