package observer.listener;

import observer.observer.Observer;

public interface Subject {
    void paramsChanged(WeatherData data );
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
