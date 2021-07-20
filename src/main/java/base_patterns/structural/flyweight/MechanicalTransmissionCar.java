package main.java.base_patterns.structural.flyweight;

public class MechanicalTransmissionCar implements Car{
    @Override
    public void drive() {
        System.out.println("Driven using mechanical transmission");
    }
}
