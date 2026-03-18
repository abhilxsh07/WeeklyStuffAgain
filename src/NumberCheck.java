// Program to check if numbers are positive/negative/zero and even/odd
import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Define an integer array of 5 elements
        int size = 5;
        int[] numbers = new int[size];

        // Get user input to store in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop through the array and check each number
        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                // Positive number - check even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even.");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd.");
                }
            } else if (numbers[i] < 0) {
                // Negative number
                System.out.println(numbers[i] + " is Negative.");
            } else {
                // Zero
                System.out.println(numbers[i] + " is Zero.");
            }
        }

        // Compare first and last element of the array
        System.out.println("\n--- Comparing First and Last Element ---");
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println(numbers[0] + " and " + numbers[numbers.length - 1] + " are Equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println(numbers[0] + " is Greater than " + numbers[numbers.length - 1] + ".");
        } else {
            System.out.println(numbers[0] + " is Less than " + numbers[numbers.length - 1] + ".");
        }

        // Close the Scanner Object
        input.close();
    }
}