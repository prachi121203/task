import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game");
while (true) 
{
            int targetNumber = rand.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". You have " + maxAttempts + " attempts.");
            while (attempts < maxAttempts)
            {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;
                if (userGuess == targetNumber)
                {
                    System.out.println("Congratulations! You have guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } 
                else if (userGuess < targetNumber) {
                    System.out.println("Try higher. Attempts left: " + (maxAttempts - attempts));
                } 
                else
                {
                    System.out.println("Try lower. Attempts left: " + (maxAttempts - attempts));
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("yes"))
            {
                System.out.println("Game over. Your score: " + score);
                break;
            }
        }
        sc.close();
    }
}