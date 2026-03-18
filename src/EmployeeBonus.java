// Program to calculate bonus for 10 employees based on years of service
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Define number of employees
        int numberOfEmployees = 10;

        // Define arrays to save salary and years of service
        double[] salary = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];

        // Define arrays to save bonus amount and new salary
        double[] bonusAmount = new double[numberOfEmployees];
        double[] newSalary = new double[numberOfEmployees];

        // Variables for totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Take input from the user for salary and years of service
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("--- Employee " + (i + 1) + " ---");

            // Get salary and validate
            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();
            if (salary[i] <= 0) {
                System.err.println("Invalid salary. Enter again.");
                i--;
                continue;
            }

            // Get years of service and validate
            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();
            if (yearsOfService[i] < 0) {
                System.err.println("Invalid years of service. Enter again.");
                i--;
                continue;
            }
        }

        // Calculate bonus based on years of service
        for (int i = 0; i < numberOfEmployees; i++) {
            // 5% if more than 5 years, else 2%
            double bonusRate = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonusAmount[i] = salary[i] * bonusRate;
            newSalary[i] = salary[i] + bonusAmount[i];

            // Calculate totals
            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results for each employee
        System.out.println("\n--- Employee Bonus Report ---");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i]
                    + ", Bonus = " + bonusAmount[i] + ", New Salary = " + newSalary[i]);
        }

        // Display totals
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the Scanner Object
        input.close();
    }
}