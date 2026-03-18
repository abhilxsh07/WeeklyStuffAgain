// Program to find the youngest and tallest among 3 friends
import java.util.Scanner;

class FriendComparison {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Define friend names and number of friends
        int numberOfFriends = 3;
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Define arrays for age and height
        int[] ages = new int[numberOfFriends];
        double[] heights = new double[numberOfFriends];

        // Take user input for age and height for each friend
        for (int i = 0; i < numberOfFriends; i++) {
            System.out.println("--- " + names[i] + " ---");
            System.out.print("Enter age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter height (cm): ");
            heights[i] = input.nextDouble();
        }

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friends
        System.out.println("\nThe youngest friend is " + names[youngestIndex]
                + " with age " + ages[youngestIndex] + ".");
        System.out.println("The tallest friend is " + names[tallestIndex]
                + " with height " + heights[tallestIndex] + " cm.");

        // Close the Scanner Object
        input.close();
    }
}