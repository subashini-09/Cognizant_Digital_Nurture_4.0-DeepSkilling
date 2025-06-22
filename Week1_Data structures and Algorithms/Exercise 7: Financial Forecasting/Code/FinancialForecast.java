package com.example.financialForecast;
import java.util.ArrayList;
import java.util.Scanner;

public class FinancialForecast {

    // Function to calculate moving average
    public static double calculateMovingAverage(ArrayList<Double> revenues, int period) {
        if (revenues.size() < period) {
            System.out.println("Not enough data for the given period.");
            return 0;
        }

        double sum = 0;
        for (int i = revenues.size() - period; i < revenues.size(); i++) {
            sum += revenues.get(i);
        }

        return sum / period;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> monthlyRevenue = new ArrayList<>();

        // Step 1: Input revenue data
        System.out.print("Enter number of months of revenue data: ");
        int months = scanner.nextInt();

        for (int i = 1; i <= months; i++) {
            System.out.print("Enter revenue for month " + i + ": ₹");
            monthlyRevenue.add(scanner.nextDouble());
        }

        // Step 2: Forecast next month's revenue using 3-month moving average
        System.out.println("\n--- Financial Forecast ---");
        double forecast = calculateMovingAverage(monthlyRevenue, 3);

        if (forecast > 0) {
            System.out.printf("Predicted revenue for next month: ₹%.2f\n", forecast);
        }

        scanner.close();
    }
}
