package unit2;

import java.util.Scanner;

public class MakeChange {

    public static void makeChange2(double amount) {
        int totalCents = (int)(amount * 100);
        int dollars = totalCents / 100;
        int change = totalCents % 100;
        int quarters = change / 25;
        change %= 25;
        int dimes = change / 10;
        change %= 10;
        int nickels = change / 5;
        change %= 5;
        int pennies = change;

        System.out.println("Change:");
        System.out.println("Dollars:" + dollars);
        System.out.println("Quarters:" + quarters);
        System.out.println("Dimes:" + dimes);
        System.out.println("Nickels:" + nickels);
        System.out.println("Pennies:" + pennies);
    }
    public static void makeChange(double amount) {
        int totalCents = (int)(amount * 100);
        int dollars = totalCents / 100;
        int change = totalCents - dollars * 100;
        int quarters = change / 25;
        int dimes = (change - quarters * 25) / 10;
        int nickels = (change - quarters * 25 - dimes * 10) / 5;
        int pennies = change - quarters * 25 - dimes * 10 - nickels * 5;
        System.out.println("Change:");
        System.out.println("Dollars:" + dollars);
        System.out.println("Quarters:" + quarters);
        System.out.println("Dimes:" + dimes);
        System.out.println("Nickels:" + nickels);
        System.out.println("Pennies:" + pennies);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total amount: ");
        double amount = scan.nextDouble();
        makeChange(amount);
        makeChange2(amount);
    }
}
