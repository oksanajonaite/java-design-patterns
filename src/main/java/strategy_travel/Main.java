package strategy_travel;

public class Main {

    public static void main(String[] args) {

        TravelContext travelContext = new TravelContext ();


        int distance = 511;
        boolean isSnowing = false;

        TravelStrategy strategy = TravelStrategyFactory.getStrategy(distance, isSnowing);

        travelContext.setStrategy(strategy);
        travelContext.startTravel("Warsaw", "Rome");
        System.out.println();

        strategy = TravelStrategyFactory.getStrategy(16, true);

        travelContext.setStrategy(strategy);
        travelContext.startTravel("Rome Airport", "Coliseum");
    }
}
