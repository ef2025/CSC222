package unit2;
import java.util.Scanner;

/* Convert inches to centimeters */
public class DistanceConversion_s {

    // needs to be static because called from a static method
    static void print(String text) {
        System.out.print(text);
    }

    static void println(String text) {
        System.out.println(text);
    }

    static final double cmToInchConversion = 2.54;
    static double inchesToCentimeters(double inches) {
        return inches * cmToInchConversion;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        print("Enter number of inches to convert to centimeters: ");
        double inches = scan.nextDouble();
        double centimeters = inchesToCentimeters(inches);
        println(inches + " inches is equal to " + centimeters + " centimeters.");
    }
}
