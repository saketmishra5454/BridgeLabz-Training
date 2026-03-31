import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EMP_COUNT = 10;
        // Arrays
        double[] salary = new double[EMP_COUNT];
        double[] yearsOfService = new double[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];
        // Totals
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input loop
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Years of Service: ");
            double years = sc.nextDouble();
            // Validation
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input Plz enter valid salary and years of service.");
                i--; // decrement index to re-enter data
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
            totalOldSalary += sal;
        }

        // Bonus calculation loop
        for (int i = 0; i < EMP_COUNT; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Output results

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println(
                "Employee " + (i + 1) +
                " | Old Salary: " + salary[i] +
                " | Bonus: " + bonus[i] +
                " | New Salary: " + newSalary[i]
            );
        }


        System.out.println("Total Old Salary  : " + totalOldSalary);
        System.out.println("Total Bonus Paid  : " + totalBonus);
        System.out.println("Total New Salary  : " + totalNewSalary);


    }
}
