package main.java.base_patterns.structural.bridge;

public class GermanCar extends Car{
    public GermanCar(Color color) {
        super(color);
    }

    @Override
    public void drive() {
        System.out.println("Car German car is driven");
        color.paintInColor();
    }
}
