package main.java.base_patterns.structural.adapter;

public class CarRunner {
    public static void main(String[] args) {
        BasicCar basicCar = new GermanCar();
        basicCar.drive();
        basicCar.goodLightsOn();
        basicCar.goodLightsOff();

        AdapterRussianToGerman adapterRussianToGerman = new AdapterRussianToGerman(new RussianCar());
        adapterRussianToGerman.drive();
        adapterRussianToGerman.goodLightsOn();
        adapterRussianToGerman.goodLightsOff();
    }
}
