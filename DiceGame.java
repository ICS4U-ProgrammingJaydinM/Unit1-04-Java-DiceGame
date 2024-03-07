/**
 * This program makes a random number than ask the user to enter a guess. 
 * If there guess is wrong it tell the user to enter a high or lower number.
 * 
 * @author Jaydin Madore
 * @version 1.0
 * @since 2023-02-29
 */

// Imports
import java.util.Scanner;
import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        // Starts the scanner.
        Scanner userInput = new Scanner(System.in);

        // Initialize values
        int guess = 0; 
        int guessCount = 0;

        // Creates a random number.
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;

        // Tells the user they are playing a Guessing Game! 
        // Than tells the user to choose 1 Number between 1-6.
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 6...");
        //Starts a Do While loop.
        do {
            // Tells the user to enter there guess.
            System.out.print("Enter your guess: ");
            // Checks if users input is a Int and if it a Int will returns true.
            if (userInput.hasNextInt()) {
                // get the users Input
                guess = userInput.nextInt();
                // If the guess is less than 1 or greater than 6.
                // It will tell the user to enter a number between 1-6 
                if (guess < 1 || guess > 6) {
                    System.out.println("Your guess must be between 1 and 6. So this won't count.");
                }
                // If the guess is greater than the randomNumber
                // it will tell the user to guess lower.
                else if (guess > randomNumber) {
                    System.out.println("Your guess is too high. Try again!");
                    // Adds one 2 guessCount
                    guessCount++;
                }
                // If the guess is Less than the randomNumber
                // it will tell the user to guess higher.
                else if (guess < randomNumber) {
                    System.out.println("Your guess is too low. Try again!");
                    // Adds one 2 guessCount
                    guessCount++;
                }
                // If the user Input made it down  to here
                // It means they did not enter Invalid input.
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 6. So this won't count.");
                userInput.next();
            }
            // When the users Input = the randomNumber 
            // you will break out of the loop. 
        } while (guess != randomNumber);
        // Adds one 2 guessCount
        guessCount++;
        System.out.println("Congratulations! You guessed the number in " + guessCount + " tries.");
        userInput.close();
    }
}