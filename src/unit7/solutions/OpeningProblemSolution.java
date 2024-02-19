package unit7.solutions;

import java.util.Random;

/**
 * Randomly create one hundred numbers, compute their average, and find out how many numbers are above the average.
 */
public class OpeningProblemSolution {
    public static void main(String[] args) {
        int numberCount = 100;
        Random rand = new Random();
        int[] numbers = new int[numberCount];

        // generate the numbers
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(numberCount);
            total += numbers[i];
        }

        // output all the numbers
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++)
                System.out.print(numbers[i * 10 + j] + " ");
            System.out.println();
        }

        // calculate requested stats
        double average = (double) total / numbers.length;
        System.out.printf("\nAverage: %.2f\n", average);
        int aboveAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > average)
                aboveAverage++;
        }

        System.out.println("\nThere are " + aboveAverage + " numbers above the average.");
    }
}
