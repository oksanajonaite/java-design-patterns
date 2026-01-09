package observer_weather_station;

public class PhoneDisplay implements Observer {

    @Override
    public void update(String message, int temperature) {
        System.out.println("Phone display: " + message + temperature + ".");
    }
}
