package unit3;

import java.util.Scanner;
import static java.lang.Math.*;

/* Assignment:
Randomly generate a number from 1 to 10 giving feedback to the player whether it is higher or lower. Simple illustration
of if, else-if, and else clauses, random number generation, and sentinel while loops.
 */
public class GuessThatNumber {
    public static void main(String[] args) {
        int secretNumber = (int)(random() * 10) + 1;
        Scanner s = new Scanner(System.in);
        int numberGuesses = 0;
        boolean guessed = false;
        while (!guessed) {
            numberGuesses++;
            System.out.print("Enter a number between 1 and 10: ");
            int guessedNumber = s.nextInt();
            if (secretNumber == guessedNumber) {
                System.out.println("You guessed it! It took you " + numberGuesses + " tries.");
            guessed = true;
            }
            else if (secretNumber > guessedNumber)
                System.out.println("Not quite, guess a little higher.");
            else System.out.println("Not quite, guess a little lower.");
        } // while
    } // main
} // class
