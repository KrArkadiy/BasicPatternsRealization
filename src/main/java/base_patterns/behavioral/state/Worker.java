package main.java.base_patterns.behavioral.state;

public class Worker {
    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }

    public void changingActivity(){
        if(activity instanceof Eating){
            setActivity(new GoingToWork());
        } else if(activity instanceof GoingToWork){
            setActivity(new Working());
        } else if(activity instanceof Working){
            setActivity(new GoingHome());
        } else if(activity instanceof GoingHome){
            setActivity(new Eating());
        }
    }

    public void doIt(){
        activity.activity();
    }
}
