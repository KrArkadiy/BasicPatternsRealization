package main.java.base_patterns.behavioral.state;

public class WorkerDay {
    public static void main(String[] args) {
        Activity activity = new Eating();
        Worker worker = new Worker();

        worker.setActivity(activity);

        for (int i = 0; i < 12; i++) {
            worker.doIt();
            worker.changingActivity();
        }
    }
}
