package main.java.base_patterns.behavioral.mediator;

public class Runner {
    public static void main(String[] args) {
        AirFieldControl airFieldControl = new AirFieldControl();
        Flight flightControlCenter = new FlightControlCenter("Control center",airFieldControl);

        Flight boening1 = new Plane("Boening 737", airFieldControl);
        Flight boening2 = new Plane("Boening 777", airFieldControl);

        airFieldControl.setFlightControlCenter(flightControlCenter);
        airFieldControl.addFlightToAriField(boening1);
        airFieldControl.addFlightToAriField(boening2);

        boening1.sendReport("I am taking off");
        flightControlCenter.sendReport("information received");

    }
}
