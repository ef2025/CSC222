package unit5.solutions;
/*
A pangram is a sentence containing every letter in the English Alphabet.
Write a function to test if the passed string in a pangram.

Input: “The quick brown fox jumps over the lazy dog”
Output: is a Pangram
Explanation: Contains all the characters from ‘a’ to ‘z’]
*/

public class PanagramSolution {

    /** returns true if valid alpha character */
    public static boolean isAlpha(char c) {
        return ('a' <= c && c <= 'z');
    }

    /** method returns true if c is in sb */
    public static boolean inStringBuilder(char c, StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (c == sb.charAt(i))
                return true;
        }
        return false;
    }

    /** method returns true if s is a Pangram */
    public static boolean isPanagram(String s) {
        s = s.toLowerCase();
        StringBuilder found = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!inStringBuilder(s.charAt(i), found) && isAlpha(s.charAt(i)))
                found.append(s.charAt(i));
        }
        return (found.length() == 26);
    }

    /** test the isPanagram function */
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(s + " is " + (isPanagram(s) ? "" : "not ") + "a panagram.");
    }

}
