package unit2;
import java.util.Scanner;
// From textbook
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        // note here that by multiplying by 100 and casting to and int and then dividing by 100, you can ensure
        // that only two decimal places is accounted for.
        System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
    }
}