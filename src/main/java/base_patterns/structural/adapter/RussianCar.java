package main.java.base_patterns.structural.adapter;

public class RussianCar implements RussianBasicCar {


    @Override
    public void drive() {
        System.out.println("Russian car is driven");
    }

    @Override
    public void basicLightsOn() {
        System.out.println("Basic lights are on");

    }

    @Override
    public void basicLightsOff() {
        System.out.println("Basic lights are on");

    }
}
