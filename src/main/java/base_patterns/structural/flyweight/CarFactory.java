package main.java.base_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
   private static final Map<String, Car> cars = new HashMap<>();

   public Car getCarByTransmission(String transmission){
       Car car = cars.get(transmission);

       if(car == null){
           if(transmission.equals("auto")){
               System.out.println("Producing automatic transmission car");
               car = new AutomaticTransmissionCar();
           } else if(transmission.equals("mechanical")){
               System.out.println("Producing mechanical transmission car");
               car = new MechanicalTransmissionCar();
           }
           cars.put(transmission,car);
       }
       return car;
   }
}
