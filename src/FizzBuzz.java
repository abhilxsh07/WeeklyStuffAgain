// Program to implement FizzBuzz and save results in a String array
import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take a number as user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate input - must be a positive integer
        if (number <= 0) {
            System.err.println("Invalid. Please enter a positive integer.");
            System.exit(0);
        }

        // Create a String Array to save the results
        String[] results = new String[number + 1];

        // Loop from 0 to the number and determine FizzBuzz values
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                results[i] = "0";
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results for each index position
        System.out.println("\n--- FizzBuzz Results ---");
        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}