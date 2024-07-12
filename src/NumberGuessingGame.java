import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a new Random object to generate random numbers
        Random rand = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = rand.nextInt(100) + 1;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store the user's guess
        int userGuess = 0;

        // Variable to keep track of the number of guesses
        int numberOfGuesses = 0;

        // Game loop
        while (userGuess != targetNumber) {
            // Prompt the user for their guess
            System.out.print("Enter your guess (1-100): ");
            userGuess = scanner.nextInt();

            // Increment the number of guesses
            numberOfGuesses++;

            // Provide feedback on the guess
            if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + numberOfGuesses + " tries.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
