package main.java.base_patterns.structural.decorator;

public class FamousFrontMan extends FrontManDecorator{
    public FamousFrontMan(FrontMan frontMan) {
        super(frontMan);
    }

    public String activityInSocialMedia(){
        return "Activity in social media";
    }

    @Override
    public String makePerformance(){
        return super.makePerformance() + activityInSocialMedia();
    }
}
