package main.java.base_patterns.structural.decorator;

public class SuccessfulFrontMan extends FrontManDecorator {
    public SuccessfulFrontMan(FrontMan frontMan) {
        super(frontMan);
    }

    public String playingGuitar() {
        return "Playing guitar on rock concerts";
    }

    @Override
    public String makePerformance() {
        return super.makePerformance() + playingGuitar();
    }
}
