package main.java.base_patterns.structural.bridge;

public class RedColor implements Color{
    @Override
    public void paintInColor() {
        System.out.println("Painted in red color");
    }
}
