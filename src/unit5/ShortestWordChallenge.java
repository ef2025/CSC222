package unit5;

import java.util.Scanner;

/*
Given a string of words, return the length of the last shortest word.
String will never be empty and you do not need to account for different data types.
*/
public class ShortestWordChallenge {

    public static void printQuestions(String data) {
        String[] questions = data.split("\\?");
        for (String question : questions) {
            System.out.println(question);
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a passage: ");
        String data = s.nextLine();
        printQuestions(data);
    }
}
