package unit4;

import java.util.Scanner;

/*
Write a program that prompts the user to enter the number of seconds, displays a
message at every second, and terminates when the time expires.
Here is a sample run:

Enter the number of seconds: 3
3 seconds remaining
2 seconds remaining
1 second remaining
Stopped

Note: to delay a Java thread use Thread.sleep(x) where x is the number of ms to sleep.

 */
public class SimulationClockCountdownChallengeSolution {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a time to count down: ");
        int seconds = s.nextInt();
        while (seconds > 0) {
            System.out.println(seconds + " second" + ((seconds > 1) ? "s" : "")
                            + " remaining.");
            Thread.sleep(1000);
            seconds--;
        }
        System.out.println("Stopped.");
    }
}
