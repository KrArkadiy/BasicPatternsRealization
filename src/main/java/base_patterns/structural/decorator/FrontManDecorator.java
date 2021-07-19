package main.java.base_patterns.structural.decorator;

public class FrontManDecorator implements FrontMan{
    FrontMan frontMan;

    public FrontManDecorator(FrontMan frontMan){
        this.frontMan = frontMan;
    }

    @Override
    public String makePerformance() {
        return frontMan.makePerformance();
    }
}
