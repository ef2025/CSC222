package unit2;
import java.util.Scanner;

/* Convert inches to centimeters */
public class DistanceConversion {

     public void promptForInches() {
         Scanner scan = new Scanner(System.in);
         print("Enter number of inches to convert to centimeters: ");
         double inches = scan.nextDouble();
         double centimeters = inchesToCentimeters(inches);
         println(inches + " inches is equal to " + centimeters + " centimeters.");
     }

    // needs to be static because called from a static method
    private void print(String text) {
        System.out.print(text);
    }

    private void println(String text) {
        System.out.println(text);
    }

    private static final double cmToInchConversion = 2.54;
    private double inchesToCentimeters(double inches) {
        return inches * cmToInchConversion;
    }

    public static void main(String[] args) {
        DistanceConversion dc = new DistanceConversion();
        dc.promptForInches();
    }
}
