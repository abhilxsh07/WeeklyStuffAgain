// Program to find the frequency of each digit in a number
import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take the input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the number
        if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
        }

        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Handle edge case for number = 0
        if (number == 0) {
            count = 1;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Define a frequency array of size 10 (for digits 0-9)
        int[] frequency = new int[10];

        // Loop through the digits array and increase the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit in the number
        System.out.println("\nDigit frequencies for number " + number + ":");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s).");
            }
        }

        // Close the Scanner Object
        input.close();
    }
}