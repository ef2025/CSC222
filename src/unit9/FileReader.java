// starter code from w3schools https://www.w3schools.com/java/java_files_read.asp
package unit9;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; //

/**
 * Simple File Reader Class to Read Text Files
 */
public class FileReader {

    // attributes of the class
    String fileName; // file name passed in constructor
    StringBuilder sb; // string builder used to concatenate files

    // method constructor
    FileReader(String fn) {
        fileName = fn;
        sb = new StringBuilder();
    }

    /**
     * Reads entire text file inserting a carriage return with each line.
     * @return String containing the contents of the file
     */

    // class methods
    String read() {
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
        var fr = new FileReader("src/unit9/FileReader.java");
        System.out.println(fr.read());
    }
}

