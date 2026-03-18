// Program to print the multiplication table of a number using an array
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get an integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate input
        if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
        }

        // Define an integer array to store results of multiplication from 1 to 10
        int tableSize = 10;
        int[] multiplicationTable = new int[tableSize];

        // Run a loop from 1 to 10 and store results in the array
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = number * (i + 1);
        }

        // Display the result from the array
        System.out.println("\n--- Multiplication Table of " + number + " ---");
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}