package strategy_travel;

/**
 * Factory us the brain of the pattern. It decides which strategy to used based on various factors.
 */
public class TravelStrategyFactory {

    public static TravelStrategy getStrategy(int travelDistance, boolean isSnowing) {

        if (travelDistance > 500 && !isSnowing) {
            return new PlaneTravelStrategy();
        } else if (travelDistance > 15 && isSnowing) {
            return new BusTravelStrategy();
        } else {
            return new BikeTravelStrategy();
        }
    }
}
