package observer.observer;

import observer.listener.WeatherData;

public interface Observer {
    void update(WeatherData data);
}
