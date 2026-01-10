package strategy_travel;

public class TravelContext {

    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void startTravel(String source, String destination) {
        strategy.travel(source, destination);
    }
}
