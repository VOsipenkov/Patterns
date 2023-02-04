package observer.observer;

import observer.subject.Subject;
import observer.subject.WeatherData;

public class Phone implements Observer {

    public Phone(Subject subject){
        subject.addObserver(this);
    }
    @Override
    public void update(WeatherData data) {
        display(data);
    }

    private void display(WeatherData data) {
        System.out.println("Phone:" + data.getHumidity() + ":" + data.getTemperature() + ":" + data.getPressure());
    }
}
