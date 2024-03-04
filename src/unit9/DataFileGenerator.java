package unit9;

import javax.xml.crypto.Data;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DataFileGenerator {
    public DataFileGenerator(String lastNameFile, String firstNameFile, int recordCount, int maxGrades, String outFile) {
        // Create Random Number Generator
        Random rand = new Random();

        // Read the last names
        FileReader frLastNames = new FileReader(lastNameFile);
        String contents = frLastNames.read();
        String[] allLastNames = contents.split("\n");

        // Read the first names
        FileReader frFirstNames = new FileReader((firstNameFile));
        contents = frFirstNames.read();
        String[] allFirstNames = contents.split("\n");

        // Create Storage
        String[] firstNames = new String[recordCount];
        String[] lastNames = new String[recordCount];
        int[][] grades = new int[recordCount][];

        // Generate Data
        for (int i = 0; i < recordCount; i++) {
            grades[i] = new int[rand.nextInt(maxGrades) + 1];
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] = 60 + rand.nextInt(40);
            }
        }

        // Generate First and Last Names
        for (int i = 0; i < recordCount; i++) {
            firstNames[i] = allFirstNames[rand.nextInt(allFirstNames.length)];
            lastNames[i] = allLastNames[rand.nextInt(allLastNames.length)];
        }

        // Build Grade String
        String formatString1 = "%10s %15s     ";
        String formatString2 = "%4d";

        // Serialize Data to File
        try {
            FileWriter fw = new FileWriter(outFile);
            for (int i = 0; i < recordCount; i++) {
                String outString =  String.format(formatString1, firstNames[i], lastNames[i]);
                // generate data and format array
                for (int j = 0; j < grades[i].length; j++) {
                    outString = outString.concat(String.format(formatString2, grades[i][j]));
                }
                outString = outString.concat("\n");
                fw.write(outString);
            }
            fw.close();
        }
        catch (IOException e) {
            System.out.println("Exception Thrown: " + e.toString());
        }
    }

    public static void main(String[] args) {
        // public DataFileGenerator(String lastNameFile, String firstNameFile, int recordCount, int maxGrades, String outFile)
        DataFileGenerator dfg = new DataFileGenerator("src\\unit9\\lastnames.txt", "src\\unit9\\firstnames.txt", 50, 6, "src\\unit9\\records.txt");
    }
}
