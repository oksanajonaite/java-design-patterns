package observer_news_agency;

public class SmartTV implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Notification on screen: " + message);
    }
}
