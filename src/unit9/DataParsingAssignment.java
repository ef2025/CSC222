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
        String data = FileReader.read(inputFile);
        // split into records i.e. .split("\n") How many records?
        String[] records = data.split("\n");
        int recordCount = records.length;
        // split into fields i.e. .split("\\s+")
        String[] fields;
        // create arrays
        String[] firstNames = new String[recordCount];
        String[] lastNames = new String[recordCount];
        int[][] grades = new int[recordCount][];
        double[] average = new double[recordCount];
        // format and store
        int numberOfGrades;
        double bestAverage = 0;  // variables to store best performer and their average
        String bestFirst = "";
        String bestLast = "";
        for (int i = 0; i < recordCount; i++) {
            numberOfGrades = 0;
            records[i] = records[i].trim();
            fields = records[i].split("\\s+"); // split into fields in the loop to make fields split every row
            firstNames[i] = fields[0]; // reading data into first names array
            lastNames[i] = fields[1]; // reading data into last names array
            grades[i] = new int[fields.length - 2];
            for (int j = 2; j < fields.length; j++) {
                grades[i][j - 2] = Integer.parseInt(fields[j]); // reading data into grades array
                numberOfGrades++;
            }
            int sum = 0;
            for (int j = 0; j < numberOfGrades; j++) {
                sum += grades[i][j];
            }
            average[i] = sum / (double)numberOfGrades; // read data into averages array
            if (average[i] > bestAverage) {
                bestAverage = average[i]; // keeping track of top average
                bestFirst = firstNames[i]; // storing best performer
                bestLast = lastNames[i];
            }
        }
        // create names array to write "lastname, firstname" in output file
        String[] names = new String[recordCount];
        for (int i = 0; i < recordCount; i++) {
            names[i] = lastNames[i] + ", " + firstNames[i];
        }

        // calculate standard deviation
        double standardDeviation = 0;
        double deviation = 0;
        double totalAverage = 0;
        for (int i = 0; i < recordCount; i++) {
            totalAverage += average[i];
        }
        totalAverage /= recordCount;
        for (int i = 0; i < recordCount; i++) {
            deviation += Math.pow((average[i] - totalAverage), 2);
        }
        standardDeviation = Math.sqrt(deviation / recordCount);


        // create output file
        String nameFormatString = "%-26s";
        String gradeFormatString = "%4d";
        String averageFormatString = "%11.2f";
        try {
            FileWriter fw = new FileWriter(outputFile);
            String outString1 = String.format("%-27s %-27s %s", "Name", "Grades", "Average\n\n"); //write header
            fw.write(outString1);
            for (int i = 0; i < recordCount; i++) { //write formatted table data to file
                String outString =  String.format(nameFormatString, names[i]);
                // generate data and format array
                String gradeString = "";
                for (int j = 0; j < grades[i].length; j++) {
                    gradeString = gradeString.concat(String.format(gradeFormatString, grades[i][j]));
                }
                outString = outString.concat(String.format("%-24s", gradeString));
                outString = outString.concat(String.format(averageFormatString, average[i]));
                outString = outString.concat("\n");
                fw.write(outString);
            }
            String outString2 = "\nSummary Data:"; // write calculated class average, top performer, standard deviation
            fw.write(outString2);
            String overallAvg = "\n\nOverall Average: ";
            String outString3 = String.format("%s%.2f", overallAvg, totalAverage);
            fw.write(outString3);
            String standardDev = "\nStandard Deviation: ";
            String outString4 = String.format("%s%.2f", standardDev, standardDeviation);
            fw.write(outString4);
            String topPerf = "\nTop Performer: " + bestLast + ", " + bestFirst + " Average: ";
            String outString5 = String.format("%s%.2f", topPerf, bestAverage);
            fw.write(outString5);

            fw.close(); //close file
        }
        catch (IOException e) {
            System.out.println("Exception Thrown: " + e.toString());
        }
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
            DataFileGenerator.create("src/unit9/lastnames.txt", "src/unit9/firstnames.txt",
                    50, 6, recordFile);
        }
        else {
            recordFile = "src\\unit9\\records.txt";
            summaryFile = "src\\unit9\\summary.txt";
            DataFileGenerator.create("src\\unit9\\lastnames.txt", "src\\unit9\\firstnames.txt",
                    50, 6, recordFile);
        }
        gradeAnalyzer(recordFile, summaryFile);
    }
}
