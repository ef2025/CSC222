// starter code from w3schools https://www.w3schools.com/java/java_files_read.asp
package unit9;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; //

/**
 * Simple File Reader Class to Read Text Files
 */
public class FileReader {
    /**
     * Reads a text file
     * @param fileName - text file to read
     * @return - file's contents in a string
     */
    public static String read(String fileName) {
        var sb = new StringBuilder();
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                sb.append(reader.nextLine()).append("\n");
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File: " + fileName + " was not found in " +
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

