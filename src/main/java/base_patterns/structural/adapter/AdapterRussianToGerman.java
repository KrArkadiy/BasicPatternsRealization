package main.java.base_patterns.structural.adapter;

public class AdapterRussianToGerman implements BasicCar{
    RussianBasicCar russianBasicCar;

    public AdapterRussianToGerman(RussianBasicCar russianBasicCar){
        this.russianBasicCar = russianBasicCar;
    }

    @Override
    public void drive() {
        russianBasicCar.drive();
    }

    @Override
    public void goodLightsOn() {
        russianBasicCar.basicLightsOn();
    }

    @Override
    public void goodLightsOff() {
        russianBasicCar.basicLightsOff();
    }
}
