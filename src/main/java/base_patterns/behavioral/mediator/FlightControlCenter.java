package main.java.base_patterns.behavioral.mediator;

public class FlightControlCenter implements Flight{
    AirField airField;
    String name;

    public FlightControlCenter(String name, AirField airField){
        this.name = name;
        this.airField = airField;
    }

    public AirField getAirField() {
        return airField;
    }

    public void setAirField(AirField airField) {
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
        System.out.println(this.name + " receiving response " + message);
    }
}
