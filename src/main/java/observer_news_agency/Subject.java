package observer_news_agency;

//influenceris, naujienu agentura ar teatro atlikejas
public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
