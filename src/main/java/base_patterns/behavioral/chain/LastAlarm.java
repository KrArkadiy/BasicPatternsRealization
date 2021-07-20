package main.java.base_patterns.behavioral.chain;

public class LastAlarm extends Notifier{
    public LastAlarm(int degreeOfLateness) {
        super(degreeOfLateness);
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
