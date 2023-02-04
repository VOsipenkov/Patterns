package observerjava.observable;

import java.util.Observable;

public class WeatherData extends Observable {
    private int humidity;
    private int temperature;
    private int pressure;

    public WeatherData() {
    }

    public void setMeasurements(int humidity, int temperature, int pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        setChanged();
        notifyObservers(this);
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }
}
