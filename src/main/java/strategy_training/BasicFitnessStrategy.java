package strategy_training;

public class BasicFitnessStrategy implements TrainingStrategy{
    @Override
    public void training() {
        System.out.println("Basic fitness: Light exercises, bodyweight movements");
    }
}
