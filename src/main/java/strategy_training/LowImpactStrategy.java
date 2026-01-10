package strategy_training;

public class LowImpactStrategy implements TrainingStrategy {

    @Override
    public void training() {
        System.out.println("Low-impact exercises: Swimming, chair exercises, stretching");
    }
}
