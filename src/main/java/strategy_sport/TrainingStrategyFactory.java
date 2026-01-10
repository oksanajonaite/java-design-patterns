package strategy_sport;

import java.util.Scanner;

public class TrainingStrategyFactory {
    
    public static TrainingStrategy getStrategy () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Are you overweight? True or false? ");
        boolean isOverweight = scanner.nextBoolean();

        if (age > 50 && isOverweight) {
            return new YogaStrategy();
        } else if (age < 50 && isOverweight) {
            return new CardioTrainingStrategy();
        } else {
            return new StrengthStrategy();
        }
    }
}
