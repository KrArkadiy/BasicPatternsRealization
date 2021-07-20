package main.java.base_patterns.behavioral.chain;

public class UrgentCall extends Notifier{
    public UrgentCall(int degreeOfLateness) {
        super(degreeOfLateness);
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
