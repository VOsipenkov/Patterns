package observer.observer;

import observer.listener.Subject;
import observer.listener.WeatherData;

public class WebSite implements Observer {

    public WebSite(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void update(WeatherData data) {
        display(data);
    }

    private void display(WeatherData data) {
        System.out.println("Website:" + data.getHumidity() + ":" + data.getTemperature() + ":" + data.getPressure());
    }
}
