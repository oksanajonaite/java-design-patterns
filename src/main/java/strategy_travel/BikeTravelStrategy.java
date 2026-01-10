package strategy_travel;

public class BikeTravelStrategy implements TravelStrategy{

    @Override
    public void travel(String source, String destination) {
        System.out.printf("Traveling by \uD83D\uDEB2 BIKE from %s to %s", source, destination);
    }
}
