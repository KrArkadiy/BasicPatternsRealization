package main.java.base_patterns.behavioral.chain;

public class OneMoreAlarm extends Notifier{

    public OneMoreAlarm(int degreeOfLateness) {
        super(degreeOfLateness);
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
