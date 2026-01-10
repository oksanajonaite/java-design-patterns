package strategy_training;

public class WalkingStrategy implements TrainingStrategy{
    @Override
    public void training() {
        System.out.println("Walking program: 30-45 minutes daily at moderate pace");
    }
}
