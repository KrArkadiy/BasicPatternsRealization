package main.java.base_patterns.structural.bridge;

public class RussianCar extends Car{
    public RussianCar(Color color) {
        super(color);
    }

    @Override
    public void drive() {
        System.out.println("Russian car is driven");
        color.paintInColor();
    }
}
