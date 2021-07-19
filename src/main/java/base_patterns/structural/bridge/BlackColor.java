package main.java.base_patterns.structural.bridge;

public class BlackColor implements Color{
    @Override
    public void paintInColor() {
        System.out.println("Painted in black");
    }
}
