package strategy_sport;

public class TrainingContext {

    private TrainingStrategy strategy;

    public void setStrategy(TrainingStrategy strategy) {
        this.strategy = strategy;
    }

    public void startTraining () {
        strategy.training();
    }
}
