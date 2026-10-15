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



    }
}
