package main.java.base_patterns.structural.facade;

public class Engine implements Car{
    @Override
    public void start() {
        System.out.println("Engine is started");
    }

    @Override
    public void stop() {
        System.out.println("Engine is stopped");
    }
}
