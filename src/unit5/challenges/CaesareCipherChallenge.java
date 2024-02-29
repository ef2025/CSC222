package unit5.challenges;

/*
The Caesar Cipher, used by Julius Caesar around 58 BC, is a substitution cipher that shifts letters in a message to make
it unreadable if intercepted. To decrypt, the receiver reverses the shift. Arab mathematician Al-Kindi broke the Caesar
Cipher using frequency analysis, which exploits patterns in letter frequencies.

Challenge:
First:
Write an encode method which takes a string and an offset and returns an encrypted string

Second:
Write a decode method which takes an encoded string and an offset and returns the original message.
*/

public class CaesareCipherChallenge {
    public static String encode(String message, int offset) {
        // convert message to lowercase
        // initialize an encoded message string
        // start loop to iterate through each character
        // if character is not alpha add it to the encoded message
        // else shift original message by offset (to the right) and add it to encoded message string
        // end for
        // return encoded message
        return "";
    }

    public static String decode(String message, int offset) {
        // initialze decoded message string
        // start loop to iterate through each character
        // if character is not alpha, add it to the decoded message
        // else shift original by offset to the left
        // end loo
        // return decoded message
        return "";

    }

    public static void main(String[] args) {
        String s = "This is a really secret message";
        int offset = 4;
        String encryptedMsg = encode(s, offset);
        System.out.println("Encrypted Message: " + encryptedMsg);
        String decryptedMsg = decode(encryptedMsg, offset);
        System.out.println("Decrypted Message: " + decryptedMsg);
    }


}
