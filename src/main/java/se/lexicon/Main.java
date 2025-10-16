package se.lexicon;

import java.time.LocalTime;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // --- Predefined exchange rates ---
        double sekToUsd = 0.092;   // 1 SEK = 0.092 USD
        double usdToSek = 10.87;   // 1 USD = 10.87 SEK
        double sekToEur = 0.086;   // 1 SEK = 0.086 EUR
        double eurToSek = 11.63;   // 1 EUR = 11.63 SEK

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        int choice = -1;

    do {
        System.out.println("Currency Converter App:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to EURO");
        System.out.println("4. Convert EURO to SEK");
        System.out.println("0. Exit");
        System.out.println("-----------------------");

        System.out.print("Choose an option: ");

        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            continue;
        }


            LocalTime currentTime = LocalTime.now();
        switch (choice) {
            case 1:
                System.out.print("Enter amount in SEK: ");
                double sekAmount = scanner.nextDouble();
                double usdAmount = sekAmount * sekToUsd;
                System.out.printf("%.2f SEK = %.2f USD%n", sekAmount, usdAmount);
                System.out.println("Conversion done on: " + LocalTime.now());
                System.out.println("-----------------------");
                break;

            case 2:
                System.out.print("Enter amount in USD: ");
                double usdInput = scanner.nextDouble();
                double sekResult = usdInput * usdToSek;
                System.out.printf("%.2f USD = %.2f SEK%n", usdInput, sekResult);
                System.out.println("Conversion done on: " + LocalTime.now());
                System.out.println("-----------------------");
                break;

            case 3:
                System.out.print("Enter amount in SEK: ");
                double sekToEurAmount = scanner.nextDouble();
                double eurResult = sekToEurAmount * sekToEur;
                System.out.printf("%.2f SEK = %.2f EUR%n", sekToEurAmount, eurResult);
                System.out.println("Conversion done on: " + LocalTime.now());
                System.out.println("-----------------------");
                break;

            case 4:
                System.out.print("Enter amount in EUR: ");
                double eurInput = scanner.nextDouble();
                double sekOutput = eurInput * eurToSek;
                System.out.printf("%.2f EUR = %.2f SEK%n", eurInput, sekOutput);
                System.out.println("Conversion done on: " + LocalTime.now());
                System.out.println("-----------------------");
                break;

            case 0:
                System.out.println("Exiting the program. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice !=0);





        }
}