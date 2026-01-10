package observer_weather_station;

public class ObserverDemoMain {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer tv = new TVDisplay();

        station.addObserver(phone);
        station.addObserver(tv);

        station.setNews("Weather Alert! Temperatures are expected to drop below ", -15);
        System.out.println();

    }
}
