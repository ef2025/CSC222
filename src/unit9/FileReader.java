// starter code from w3schools https://www.w3schools.com/java/java_files_read.asp
package unit9;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; //

/**
 * Simple File Reader Class to Read Text Files
 */
public class FileReader {
    public static String read(String fn) {
        var sb = new StringBuilder();
        try {
            File file = new File(fn);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                sb.append(reader.nextLine()).append("\n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File: " + fn + " was not found in " +
                    System.getProperty("user.dir"));
        }
        return sb.toString();
    }

    // File Reader Test Code
    public static void main(String args[]) {
        String contents;
        if (System.getProperty("os.name").contains("OS X"))
            contents = FileReader.read("src/unit9/FileReader.java");
        else
            contents = FileReader.read("src\\unit9\\FileReader.java");
        System.out.println(contents);
    }
}

