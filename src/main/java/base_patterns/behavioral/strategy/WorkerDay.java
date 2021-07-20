package main.java.base_patterns.behavioral.strategy;

public class WorkerDay {
    public static void main(String[] args) {
        Activity activity = new Eating();
        Worker worker = new Worker();

        worker.setActivity(new Working());
        worker.executeActivity();

        worker.setActivity(new GoingToWork());
        worker.executeActivity();

        worker.setActivity(new Eating());
        worker.executeActivity();

        worker.setActivity(new GoingHome());
        worker.executeActivity();
    }
}
