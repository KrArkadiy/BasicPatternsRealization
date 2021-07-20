package main.java.base_patterns.behavioral.template;

public abstract class StrategyTemplate {
    public void choosingStrategy(){
        System.out.println("Choose strategy");
        chosenStrategy();
        System.out.println("Operation ended");
    }

    public abstract void chosenStrategy();
}
