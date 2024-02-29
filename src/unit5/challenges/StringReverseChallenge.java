package unit5.challenges;

/*
Given a string, the task is to write a function the returns a string in the reverse order.

Example:
reverseString(“i love programming very much”) should return:
“much very programming love i”

 Note, you may do the challenge "in place" or create a new returned string.
 */


public class StringReverseChallenge {

    public static String reverseString(String s) {
        String[] words = s.split(" ");
        String rstring = "";
        for (int i = words.length - 1; i >= 0; i--)
            rstring = rstring + words[i] + " ";
        rstring = rstring.trim();
        return rstring;
    }
    public static void main(String[] args) {
        String s = "My dog rover ate a four leaf clover!";
        s = s.trim(); // remove leading and trailing spaces
        String r = reverseString(s);
        System.out.println("Original: " + s + " Reversed: " + r);
    }
}
