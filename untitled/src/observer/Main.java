package observer;

import observer.subject.SubjectImpl;
import observer.subject.WeatherData;
import observer.observer.Phone;
import observer.observer.WebSite;

public class Main {
    public static void main(String[] args) {
        var subject = new SubjectImpl();
        var phone = new Phone(subject);
        var website = new WebSite(subject);
        subject.paramsChanged(new WeatherData(60, 30, 720));
        subject.paramsChanged(new WeatherData(55, 30, 720));
        subject.removeObserver(phone);
        subject.paramsChanged(new WeatherData(60, 28, 720));
    }
}
