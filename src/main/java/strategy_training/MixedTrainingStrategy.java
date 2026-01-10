package strategy_training;

public class MixedTrainingStrategy implements TrainingStrategy {
    @Override
    public void training() {
        System.out.println("Mixed training: Cardio + Strength 3-4 times per week");
    }
}
