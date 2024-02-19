package unit7.solutions;

import java.util.Random;

/**
 * Given an array of integers, return its reverse.
 * Note: Do two versions safeReverse returns a reversed copy. reverse mutates the passed array.
 */
public class ReverseSolution {
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
        final int COUNT = 11;
        int[] data = createData(COUNT);
        System.out.print("\nOriginal: ");
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");

        int[] sreverse = safeReverse(data);
        System.out.print("\nSafe Reverse: ");
        for (int i = 0; i < sreverse.length; i++)
            System.out.print(sreverse[i] + " ");

        reverse(data);
        System.out.print("\nMutated Reverse: ");
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");

        data = reverse2(data);
        System.out.print("\nMutated Reverse2: ");
        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
    }

    /**
     * Copies passed array and returns its reverse
     * @param original
     * @return
     */
    public static int[] safeReverse(final int[] original) {
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++)
            reversed[i] = original[(original.length - 1) - i];
        return reversed;
    }

    /**
     * Reverses passed array
     * @param data - array of integers
     */
    public static void reverse(int[] data) {
        int swap, iter;
        if (data.length % 2 == 0)
            iter =  data.length / 2;
        else
            iter = data.length / 2 + 1;
        for (int i = 0; i < data.length / 2; i++) {
            swap = data[i];
            data[i] = data[(data.length - 1) - i];
            data[data.length - i - 1] = swap;
        }
    }

    public static int[] reverse2(int[] data) {
        int[] reversed = new int[data.length];
        for (int i = 0; i < data.length; i++)
            reversed[i] = data[(data.length - 1) - i];
        return reversed;
    }
}
