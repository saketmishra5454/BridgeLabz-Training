public class ZaraEmployeeBonus {

    static final int EMP_COUNT = 10;

    // generates salary and years of service
    static double[][] generateEmployeeData() {

        double[][] data = new double[EMP_COUNT][2];

        for (int i = 0; i < EMP_COUNT; i++) {

            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = 1 + (int)(Math.random() * 10);
        }

        return data;
    }

    // calculates bonus and new salary
    static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[EMP_COUNT][4];

        for (int i = 0; i < EMP_COUNT; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary;
            result[i][1] = years;
            result[i][2] = bonus;
            result[i][3] = salary + bonus;
        }

        return result;
    }

    // prints table and totals
    static void displayResult(double[][] result) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Emp\tOldSal\tYears\tBonus\tNewSal");

        for (int i = 0; i < EMP_COUNT; i++) {

            System.out.printf("%d\t%.0f\t%.0f\t%.2f\t%.2f%n",
                    i + 1,result[i][0],result[i][1],result[i][2],result[i][3]);

            totalOldSalary += result[i][0];
            totalBonus += result[i][2];
            totalNewSalary += result[i][3];
        }

        System.out.println("-------------------------------------");

        System.out.printf(
                "Total Old Salary : %.2f%n",
                totalOldSalary
        );

        System.out.printf(
                "Total Bonus Paid : %.2f%n",
                totalBonus
        );

        System.out.printf(
                "Total New Salary : %.2f%n",
                totalNewSalary
        );
    }

    public static void main(String[] args) {

        double[][] employeeData = generateEmployeeData();
        double[][] finalData = calculateBonus(employeeData);
        displayResult(finalData);
    }
}
