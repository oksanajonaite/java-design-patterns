package strategy_travel;

public class BusTravelStrategy implements TravelStrategy{

    @Override
    public void travel(String source, String destination) {
        System.out.printf("Traveling by \uD83D\uDE8C BUS from %s to %s", source, destination);

    }
}
