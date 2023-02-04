package observerjava.observer;

import observerjava.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class Phone implements Observer {
    private Observable observable;

    public Phone(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object data) {
        if (data instanceof WeatherData) {
            System.out.print("Temperature " + ((WeatherData) data).getTemperature());
            System.out.print("   Humidity " + ((WeatherData) data).getHumidity());
            System.out.println("   Pressure " + ((WeatherData) data).getPressure());
        } else {
            System.err.println("Data is not instance of WeatherData!");
        }
    }

    public void remove() {
        observable.deleteObserver(this);
    }
}
