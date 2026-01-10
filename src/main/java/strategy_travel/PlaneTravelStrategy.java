package strategy_travel;

public class PlaneTravelStrategy implements TravelStrategy {

    @Override
    public void travel(String source, String destination) {
        System.out.printf("Traveling by ✈\uFE0F PLANE from %s to %s", source, destination);
    }
}
