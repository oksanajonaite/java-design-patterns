package strategy_training;

public class Main {

    public static void main(String[] args) {

        TrainingContext trainingContext = new TrainingContext();

        TrainingStrategy strategy = TrainingStrategyFactory.getStrategy();

        trainingContext.setStrategy(strategy);
        trainingContext.startTraining();

    }
}
