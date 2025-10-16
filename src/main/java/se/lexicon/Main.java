package se.lexicon;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            int SEK, USD, EURO;


        System.out.println("Currency Converter App:");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to EURO");
        System.out.println("4. Convert EURO to SEK");
        System.out.println("0. Exit");

        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose to convert SEK to USD.");
                break;
            case 2:
                System.out.println("You chose to convert USD to SEK.");
                break;
            case 3:
                System.out.println("You chose to convert SEK to EURO.");
                break;
            case 4:
                System.out.println("You chose to convert EURO to SEK.");
                break;
            case 0:
                System.out.println("Exiting the program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }




    }
}