package observer.listener;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

    private List<Observer> observerList;

    @Override
    public void paramsChanged(WeatherData data) {
        observerList.forEach(observer -> observer.update(data));
        System.out.println("=====End notification=======");
    }

    @Override
    public void addObserver(Observer observer) {
        if (observerList == null || observerList.size() == 0) {
            observerList = new ArrayList<>();
        }
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
}
