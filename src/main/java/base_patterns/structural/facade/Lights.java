package main.java.base_patterns.structural.facade;

public class Lights implements Car{
    @Override
    public void start() {
        System.out.println("Lights are on");
    }

    @Override
    public void stop() {
        System.out.println("Lights are off");
    }
}
