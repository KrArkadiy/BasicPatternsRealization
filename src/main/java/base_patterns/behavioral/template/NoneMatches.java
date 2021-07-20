package main.java.base_patterns.behavioral.template;

public class NoneMatches extends StrategyTemplate{
    @Override
    public void chosenStrategy() {
        System.out.println("Executing none matches strategy");
    }
}
