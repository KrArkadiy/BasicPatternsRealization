package main.java.base_patterns.behavioral.mediator;

public class Plane implements Flight{
    String name;
    AirField airField;

    public Plane(String name, AirField airField) {
        this.name = name;
        this.airField = airField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendReport(String message) {
        airField.sendReport(message,this);
    }

    @Override
    public void getResponse(String message) {
        System.out.println(this.name + " receiving message " + message);
    }
}
