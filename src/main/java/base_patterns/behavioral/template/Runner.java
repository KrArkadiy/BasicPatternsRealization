package main.java.base_patterns.behavioral.template;

public class Runner {
    public static void main(String[] args) {
        StrategyTemplate strategy1 = new AllMatches();
        strategy1.choosingStrategy();

        System.out.println();

        StrategyTemplate strategy2 = new NoneMatches();
        strategy2.choosingStrategy();
    }
}
