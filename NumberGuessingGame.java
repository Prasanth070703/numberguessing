//****************************************************------>NUMBER GUESSING GAME<------------*********************************************************


import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberOfAttempts = 10;
        int score = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);
        System.out.println("You have " + numberOfAttempts + " attempts to guess it.");

        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        for (int attempt = 1; attempt <= numberOfAttempts; attempt++) {
            System.out.print("Attempt #" + attempt + ": Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                score += (numberOfAttempts - attempt + 1);
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Try higher!");
            } else {
                System.out.println("Try lower!");
            }

            if (attempt == numberOfAttempts) {
                System.out.println("Out of attempts. The correct number was: " + randomNumber);
            }
        }

        System.out.println("Your score: " + score);
        scanner.close();
    }
}
