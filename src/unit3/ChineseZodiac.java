package unit3;

import java.util.Scanner;

public class ChineseZodiac {

    public static String oddEven(int number) {
        return (number % 2 == 0) ? "even" : "odd";
    }

    public static String getAnimal(int year) {
        return switch(year % 12) {
            case 0 -> "Monkey";
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Rat";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Sheep";
            default -> throw new IllegalStateException("Unexpected value: " + year % 12);
        };
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year you were born: ");
        int year = s.nextInt();
        System.out.println("According to the Chinese Zodiac, your birth year is the year of the " + getAnimal(year));
        System.out.println("You were born in an " + oddEven(year) + " year.");

    }
}
