package main.java.base_patterns.behavioral.chain;

public abstract class Notifier {
    private int degreeOfLateness;
    private Notifier nextNotifier;

    public Notifier(int degreeOfLateness){
        this.degreeOfLateness = degreeOfLateness;
    }

    public void setNextNotifier(Notifier nextNotifier){
        this.nextNotifier = nextNotifier;
    }

    public void notifyColleagues(String message, int degree){
        if(degree >= degreeOfLateness){
            write(message);
        }
        if(nextNotifier != null){
            nextNotifier.notifyColleagues(message, degree);
        }
    }
    public abstract void write(String message);

}
