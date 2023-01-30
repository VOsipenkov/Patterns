package observer.listener;

public class WeatherData {
    private int humidity;
    private int temperature;
    private int pressure;

    public WeatherData() {
    }

    public WeatherData(int humidity, int temperature, int pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
