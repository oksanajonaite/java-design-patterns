package observer_news_agency;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{

    private List<Observer> observers = new ArrayList<>();
    private String news;

    //create and notify
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) { //observers.forEach(observer -> observer.update(news));
            observer.update(news);
        }
    }
}
