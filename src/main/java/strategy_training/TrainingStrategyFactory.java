package strategy_training;

import java.util.Scanner;

public class TrainingStrategyFactory {
    
    public static TrainingStrategy getStrategy () {

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean isOverweight = false;
        boolean hasInjuries = false;
        String fitnessLevel = "";

        // While loop for age input with validation
        while (true) {
            System.out.println("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age > 0 && age < 120) {
                    break;
                } else {
                    System.out.println("Please enter a valid age (1-119)");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        // While loop for overweight input with validation
        while (true) {
            System.out.println("Are you overweight? (true/false): ");
            if (scanner.hasNextBoolean()) {
                isOverweight = scanner.nextBoolean();
                break;
            } else {
                System.out.println("Invalid input. Please enter 'true' or 'false'.");
                scanner.next();
            }
        }

        // While loop for injuries input with validation
        while (true) {
            System.out.println("Do you have any injuries? (true/false): ");
            if (scanner.hasNextBoolean()) {
                hasInjuries = scanner.nextBoolean();
                break;
            } else {
                System.out.println("Invalid input. Please enter 'true' or 'false'.");
                scanner.next();
            }
        }

        // While loop for fitness level input with validation
        while (true) {
            System.out.println("Enter your fitness level (beginner/intermediate/advanced): ");
            fitnessLevel = scanner.next().toLowerCase();
            if (fitnessLevel.equals("beginner") ||
                    fitnessLevel.equals("intermediate") ||
                    fitnessLevel.equals("advanced")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'beginner', 'intermediate', or 'advanced'.");
            }
        }

        // Strategy selection logic with multiple conditions
        if (hasInjuries) {
            return new YogaStrategy(); // Safe for injuries
        } else if (age > 65) {
            return new LowImpactStrategy(); // Gentle exercises for seniors
        } else if (age > 50 && isOverweight) {
            return new HIITStrategy();
        } else if (age < 50 && isOverweight && fitnessLevel.equals("beginner")) {
            return new WalkingStrategy(); // Start slow
        } else if (isOverweight && fitnessLevel.equals("intermediate")) {
            return new WalkingStrategy();
        } else if (isOverweight && fitnessLevel.equals("advanced")) {
            return new HIITStrategy(); // High intensity for advanced
        } else if (age < 30 && fitnessLevel.equals("advanced")) {
            return new LowImpactStrategy();
        } else if (age >= 30 && age <= 50 && fitnessLevel.equals("intermediate")) {
            return new MixedTrainingStrategy(); // Combination
        } else if (fitnessLevel.equals("beginner")) {
            return new BasicFitnessStrategy();
        } else {
            return new LowImpactStrategy(); // Default
        }
    }
}
