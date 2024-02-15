package unit5.solutions;

import java.util.Scanner;

public class ShortestWordChallengeSolution {
    public static void option2(String data) {
        int start = 0;
        int end;
        int minLength = 99;
        String minString = "";
        do  {
            end = data.indexOf(' ', start, data.length());
            if (end == -1) end = data.length();
            if (minLength > end - start) {
                minLength = end - start;
                minString = data.substring(start, end);
            }
            start = end + 1; // move to next word
        } while (end < data.length());
        System.out.println("The smallest string with a length of " + minLength +
                " is " + minString);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string of text to be analyzed: ");
        String data = s.nextLine();
        String[] parts = data.split(" ");
        String minString = parts[0];
        int minLength = parts[0].length();
        for ( String part : parts ) {
            if (part.length() <= minLength) {
                minString = part;
                minLength = part.length();
            }
        }
        System.out.println("The smallest string with a length of " + minLength +
                " is " + minString);

        // Another method using substrings
        option2(data);
    }
}
