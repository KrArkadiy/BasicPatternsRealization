package main.java.base_patterns.structural.flyweight;

public class AutomaticTransmissionCar implements Car{
    @Override
    public void drive() {
        System.out.println("Car is driven using automatic transmission.");
    }
}
