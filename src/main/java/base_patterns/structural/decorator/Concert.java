package main.java.base_patterns.structural.decorator;

public class Concert {
    public static void main(String[] args) {
        FrontMan frontMan = new FamousFrontMan(new SuccessfulFrontMan(new FamousFrontMan(new RockBandFrontMan())));
        System.out.println(frontMan.makePerformance());
    }
}
