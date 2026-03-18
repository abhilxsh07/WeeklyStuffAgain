// Program to find the largest and second largest digit of a number
import java.util.Scanner;

class LargestSecondLargest {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Validate the number
        if (number <= 0) {
            System.err.println("Invalid. Enter a positive number.");
            System.exit(0);
        }

        // Define an array to store the digits with initial max size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Use a loop to extract digits from the number
        int temp = number;
        while (temp != 0) {
            // Remove the last digit and add it to the array
            digits[index] = temp % 10;
            index++;

            // If index equals maxDigit, break from the loop
            if (index == maxDigit) {
                break;
            }

            temp /= 10;
        }

        // Define variables for largest and second largest digit
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("\nNumber: " + number);
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the Scanner Object
        input.close();
    }
}