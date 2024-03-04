package unit9;

/*
In this assignment, you are to:

 1. Generate and read a text file. (Generation code given).
 2. Parse the contents into three arrays containing:
        a. The students full name
        b. An array of scores (yes, an array of arrays)
        c. Course average (calculated).
 3. Generate a formatted output file with this data and the Standard Deviation of the averages.

Notes:
    1. You may create any classes and methods you like, but you must test with my file generator
        and use my file reader class.
    2. File generator will produce ragged test scores, you will have to compensate for this.
    3. File generator will create data files of random record length. Your code will need to accomodate this.

*/


import javax.xml.crypto.Data;

public class DataParsingAssignment {
    public static void main(String[] args) {
        DataFileGenerator dfg = new DataFileGenerator("src\\unit9\\lastnames.txt", "src\\unit9\\firstnames.txt", 50, 6, "records.txt");
        FileReader fr = new FileReader("records.txt");
        System.out.println(fr.read());
    }
}
