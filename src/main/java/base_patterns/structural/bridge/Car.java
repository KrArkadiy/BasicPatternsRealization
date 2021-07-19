package main.java.base_patterns.structural.bridge;

public abstract class Car {
    protected Color color;

    public Car(Color color){
        this.color = color;
    }

    public abstract void drive();
}
