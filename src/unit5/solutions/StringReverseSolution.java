package unit5.solutions;

public class StringReverseSolution {

    public static int getNextWordBoundary(String s, int ptr) {
        while (s.charAt(ptr) != ' ') { // look for space between words
            ptr -= 1; // back up through string
            if (ptr == 0) // handle special case of beginning of string
                return ptr;
        }
        return ptr + 1; // return start of next word
    }
    public static String reverseString(String s) {
        int start = 0, end = s.length() - 1; // string boundaries
        StringBuilder rstring = new StringBuilder(); // created to hold reversed string
        int ptr;
        do {
            ptr = getNextWordBoundary(s, end);
            for (int i = ptr; i <= end; i++) {
                rstring.append(s.charAt(i));
            }
            if (ptr != 0)
                rstring.append(" ");
            end = ptr - 2;
        }
        while (end > 0); // once end reaches 0, string reversal complete
        return rstring.toString();
    }

    public static void main(String[] args) {
        String s = "My dog rover ate a four leaf clover!";
        s = s.trim(); // remove leading and trailing spaces
        String r = reverseString(s);
        System.out.println("Original: " + s + " Reversed: " + r);
    }
}
