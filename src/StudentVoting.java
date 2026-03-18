// Program to check voting eligibility of 10 students based on age
import java.util.Scanner;

class StudentVoting {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Define an array of 10 integer elements for student ages
        int numberOfStudents = 10;
        int[] ages = new int[numberOfStudents];

        // Take user input for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility for each student
        System.out.println("\n--- Voting Eligibility ---");
        for (int i = 0; i < ages.length; i++) {
            // If age is negative, print invalid
            if (ages[i] < 0) {
                System.out.println("Student " + (i + 1) + ": Invalid age.");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        // Close the Scanner Object
        input.close();
    }
}