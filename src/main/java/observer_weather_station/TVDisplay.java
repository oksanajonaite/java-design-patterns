package observer_weather_station;

public class TVDisplay implements Observer {

    @Override
    public void update(String message, int temperature) {
        System.out.printf("TV display: " + message + temperature + ".");
    }
}
