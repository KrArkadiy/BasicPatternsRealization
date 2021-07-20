package main.java.base_patterns.behavioral.observer;

public class Runner {
    public static void main(String[] args) {
        RockBandTwitter rockBandTwitter = new RockBandTwitter();

        rockBandTwitter.addTwit("Hello");
        rockBandTwitter.addTwit("New Twit");

        Observer firstSubscriber = new Subscriber("First one");
        Observer secondSubscriber = new Subscriber("Second one");

        rockBandTwitter.addObserver(firstSubscriber);
        rockBandTwitter.addObserver(secondSubscriber);

        rockBandTwitter.addTwit("Test");
    }
}
