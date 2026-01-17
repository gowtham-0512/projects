import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("=== Number Guessing Game ===");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int guess = -1;

            System.out.println("\nI have selected a number between 1 and 100.");
            System.out.println("Try to guess it!");

            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");

                // Validate input
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                    continue;
                }

                guess = scanner.nextInt();
                attempts++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("🎉 Correct!");
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("\nThank you for playing!");
        scanner.close();
    }
}
