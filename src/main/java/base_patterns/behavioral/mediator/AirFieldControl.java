package main.java.base_patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirFieldControl implements AirField{
    Flight flightControlCenter;

    List<Flight> flights = new ArrayList<>();

    public void addFlightToAriField(Flight flight){
        flights.add(flight);
    }

    public void setFlightControlCenter(Flight flightControlCenter){
        this.flightControlCenter = flightControlCenter;
    }

    @Override
    public void sendReport(String message, Flight flight) {
        for(Flight flight1 : flights){
            if(flight1 != flight){
                flight1.getResponse(message);
            }
        }
        flightControlCenter.getResponse(message);
    }
}
