package unit9;

/*
In this assignment, you are to:

 1. Generate and read a text file. (Generation code given).
 2. Parse the contents into three arrays containing:
        a. The students full name (last then first)
        b. An array of scores (yes, an array of arrays)
        c. Course average (calculated) for each student.
 3. Generate a formatted output file with this data
 4. Create a summary section with:
        a. The overall average.
        b. The standard deviation
        c. The top performer

 5. Implementation should be a static method (gradeAnalyzer) which takes the input file name and output file name as arguments.

Note: Yes, I know that with different number of scores for each student, the average is not a "fair" comparison
but in this case it is just a metric noting the performance of the student on completed material.

Notes:
    1. You may create any classes and methods you like, but you must test with my file generator
        and use my file reader class.
    2. File generator will produce ragged test scores, you will have to compensate for this.
    3. File generator will create data files of random record length. Your code will need to accomodate this.
    4. Grades are integers but the average should be a double
*/

import java.io.FileWriter;
import java.io.IOException;

public class DataParsingAssignment {
    /**
     * CSC 222 Coding Project 1
     * @param inputFile - data file of student records to be analyized
     * @param outputFile - name of file to be created with summary report
     */
    public static void gradeAnalyzer(String inputFile, String outputFile) {
    // read file
    // split into records i.e. .split("\n") How many records?
    // split into fields i.e. .split("\\s+")
    // create arrays
    // format and store
    // read data into grades array
    // calculate student average - don't forget to keep up with best performer
    // keep up with all student average
    // calculate standard deviation
    // create output file
    // write formatted table data to file
    // write calculated class average, top performer, and standard deviation
    // close file
    // Examine output and make sure you didn't forget anything and spot check of calculations
    // make sense.
    // Submit work to Canvas.
    // Celebrate!
    }

    public static void main(String[] args) {
        DataFileGenerator dfg = null;
        String recordFile, summaryFile;
        if (System.getProperty("os.name").contains("OS X")) {
            recordFile = "src/unit9/records.txt";
            summaryFile = "src/unit9/summary.txt";
            DataFileGenerator.create("src/unit9/lastnames.txt", "src/unit9/firstnames.txt", 50, 6, recordFile);
        }
        else {
            recordFile = "src\\unit9\\records.txt";
            summaryFile = "src\\unit9\\summary.txt";
            DataFileGenerator.create("src\\unit9\\lastnames.txt", "src\\unit9\\firstnames.txt", 50, 6, recordFile);
        }
        gradeAnalyzer(recordFile, summaryFile);
    }
}
