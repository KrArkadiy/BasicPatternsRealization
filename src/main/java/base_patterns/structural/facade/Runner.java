package main.java.base_patterns.structural.facade;

public class Runner {
    public static void main(String[] args) {
        CarExploitation carExploitation = new CarExploitation();
        carExploitation.carIsStarted();
        carExploitation.carIsStopped();
    }
}
