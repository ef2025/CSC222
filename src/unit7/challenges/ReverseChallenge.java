package unit7.challenges;

import java.util.Random;

/**
 * Given an array of integers, return its reverse.
 * Note: Do two versions safeReverse returns a reversed copy. reverse mutates the passed array.
 */
public class ReverseChallenge {
    /**
     * Creates array of random data
     * @param count - number to be created
     * @return - created array
     */
    public static int[] createData(int count) {
        Random rand = new Random(); // random number generator
        int[] things = new int[count]; // create a new array to "rate"
        for (int i = 0; i < count; i++) {
            things[i] = rand.nextInt(count) + 1; // assign a random number as a rating
        }
        return things;
    }

    public static void main(String[] args) {
        final int COUNT = 100;
        int[] data = createData(COUNT);
        int[] sreverse = safeReverse(data);
        reverse(data);
        System.out.print("\nSafe Reverse: ");
        for (int i = 0; i < sreverse.length; i++)
            System.out.println(sreverse[i] + " ");

        System.out.print("\nMutated Reverse: ");
        for (int i = 0; i < data.length; i++)
            System.out.println(data[i] + " ");
    }

    /**
     * Copies passed array and returns its reverse
     * @param original
     * @return
     */
    public static int[] safeReverse(final int[] original) {
        return new int[0];
    }

    /**
     * Reverses passed array
     * @param data - array of integers
     */
    public static void reverse(int[] data) {

    }
}
