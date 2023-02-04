package observer.observer;

import observer.subject.WeatherData;
import observer.subject.Subject;

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
