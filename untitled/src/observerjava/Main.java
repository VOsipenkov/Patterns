package observerjava;

import observerjava.observable.WeatherData;
import observerjava.observer.Phone;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherData observable = new WeatherData();
        Observer phone = new Phone(observable);

        observable.setMeasurements(1,1,1);
        observable.setMeasurements(1,3,1);
        observable.setMeasurements(1,5,1);
    }
}
