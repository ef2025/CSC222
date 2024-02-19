package unit7.challenges;
import java.util.Random;
/**

The museum of incredibly dull things
The museum of incredibly dull things wants to get rid of some exhibits. Miriam, the interior architect, comes up with a
plan to remove the most boring exhibits. She gives them a rating, and then removes the one with the lowest rating.

However, just as she finished rating all exhibits, she's off to an important fair, so she asks you to write a program
that tells her the ratings of the exhibits after removing the lowest one. Fair enough.

Task
Given an array of integers, remove the smallest value. Do not mutate the original array/list. If there are multiple
elements with the same value, remove the one with the lowest index. If you get an empty array/list, return an empty
array/list.

Don't change the order of the elements that are left.

Examples
* Input: [1,2,3,4,5], output = [2,3,4,5]
* Input: [5,3,2,1,4], output = [5,3,2,4]
* Input: [2,2,1,2,1], output = [2,2,2,1]

*/
public class RemoveTheSmallestChallenge {
    /**
     * Entry method from OS
     * @param args - command line arguments (not used)
     */
    public static void main(String[] args) {
        final int numberOfThings = 10;
        // C++ students: https://stackoverflow.com/questions/5157439/why-doesnt-c-support-functions-returning-arrays#:~:text=%22You%20can't%20return%20array,that's%20not%20possible%20with%20arrays.%22
        int[] things = getRatings(numberOfThings);
        int[] modifiedThings = removeMostDullThing(things);
        System.out.print("Original Things: ");
        for (int i = 0; i < numberOfThings; i++)
            System.out.print(things[i] + " ");
        System.out.print("Modified Things: ");
        for (int i = 0; i < modifiedThings.length; i++)
            System.out.print(modifiedThings[i] + " ");
    }

    /**
     * Creates a test list of ratings
     * @param numberOfDullThings - number of items (and ratings) to create
     * @return an array with random ratings each from 1 to number of items.
     */
    public static int[] getRatings(int numberOfDullThings) {
        Random rand = new Random(); // random number generator
        int[] things = new int[numberOfDullThings]; // create a new array to "rate"
        for (int i = 0; i < numberOfDullThings; i++) {
            things[i] = rand.nextInt(numberOfDullThings) + 1; // assign a random number as a rating
        }
        return things;
    }

    /**
     * removeMostDullThing - method which removes the lowest rated attraction at the museum passed in an array
     * @param things - array of ratings
     * @return - new array with the lowest rating removed
     */
    public static int[] removeMostDullThing(int[] things) {
        return new int[0]; // return empty array to make error go away
    }
}

