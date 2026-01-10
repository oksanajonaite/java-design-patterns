package strategy_sport;

public class StrengthStrategy implements TrainingStrategy {

    @Override
    public void training() {
        System.out.println("Strength training: weight lifting, pull-ups, push-ups");
    }
}
