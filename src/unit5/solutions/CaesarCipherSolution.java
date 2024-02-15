package unit5.solutions;

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

/** Encrypts the message based on the offset passed in */
public class CaesarCipherSolution {
    public static String encode(String message, int offset) {
        if (offset > 26) offset = offset - 26; // safety
        message = message.toLowerCase(); // convert message to lower case
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (!PanagramSolution.isAlpha(message.charAt(i)))
                encryptedMessage.append(message.charAt(i));
            else {
                if (message.charAt(i) + offset > 'z') {
                    encryptedMessage.append((char)('a' + (message.charAt(i) + offset - 'z')));
                }
                else {
                    encryptedMessage.append((char)(message.charAt(i) + offset));
                }
            }
        }
        return encryptedMessage.toString();
    }

    /** Decrypts an encrypted message based on offset */
    public static String decode(String message, int offset) {
        if (offset > 26) offset = offset - 26;
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (!PanagramSolution.isAlpha(message.charAt(i)))
                decryptedMessage.append(message.charAt(i));
            else {
                if (message.charAt(i) - offset < 'a') {
                    char letter = (char) ('z' - ('a' - (message.charAt(i) - offset)));
                    decryptedMessage.append(letter);
                } else
                    decryptedMessage.append((char) ((message.charAt(i) - offset)));
            }
        }
        return decryptedMessage.toString();
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
