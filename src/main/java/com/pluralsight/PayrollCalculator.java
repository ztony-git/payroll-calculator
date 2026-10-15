package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        double hours = scanner.nextDouble();

        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        double grossPay;

        if (hours > 40) {
            grossPay = 40 * payRate + (hours - 40) * payRate * 1.5;
        } else {
            grossPay = hours * payRate;
        }

        System.out.printf("Name: %s%n", name);
        System.out.printf("Gross Pay: $%.2f", grossPay);
    }
}
