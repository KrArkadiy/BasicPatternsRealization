package main.java.base_patterns.behavioral.strategy;

public class Worker {
    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }


    public void executeActivity(){
        activity.activity();
    }
}
