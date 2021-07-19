package main.java.base_patterns.structural.adapter;

public class GermanCar implements BasicCar {

    @Override
    public void drive() {
        System.out.println("German car is driven");
    }

    @Override
    public void goodLightsOn() {
        System.out.println("Good lights are on");
    }

    @Override
    public void goodLightsOff() {
        System.out.println("Good lights are off");
    }
}
