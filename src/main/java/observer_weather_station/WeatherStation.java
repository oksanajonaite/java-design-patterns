package observer_weather_station;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private int temperature;
    private String message;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setNews(String message, int temperature) {
        this.message = message;
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(message, temperature));
    }
}
