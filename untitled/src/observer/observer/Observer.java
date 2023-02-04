package observer.observer;

import observer.subject.WeatherData;

public interface Observer {
    void update(WeatherData data);
}
