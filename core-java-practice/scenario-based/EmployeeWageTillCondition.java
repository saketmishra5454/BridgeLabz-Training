public class EmployeeWageTillCondition {

    public static void main(String[] args) {

        // displaying welcome message 
        System.out.println("Welcome to Employee");
        System.out.println("Wage Computation");
        System.out.println("Program on Master Branch");

        //fixed assumptions
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 8;

        int maxWorkingDays = 20;
        int maxWorkingHours = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        //calculating wages until condition is met
        while (totalWorkingDays < maxWorkingDays &&
               totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            //random check for employee type 
            // 0 -> Absent | 1 -> Full Time | 2 -> Part Time
            int employeeType = (int) (Math.random() * 3);

            int dailyHours = 0;

            //  deciding daily hours using switch case
            switch (employeeType) {

                case 1:
                    System.out.println("Day " + totalWorkingDays + ": Employee is Full Time");
                    dailyHours = fullTimeHours;
                    break;

                case 2:
                    System.out.println("Day " + totalWorkingDays + ": Employee is Part Time");
                    dailyHours = partTimeHours;
                    break;

                default:
                    System.out.println("Day " + totalWorkingDays + ": Employee is Absent");
                    dailyHours = 0;
            }

            //checking hour limit before adding
            if (totalWorkingHours + dailyHours > maxWorkingHours) {
                dailyHours = maxWorkingHours - totalWorkingHours;
            }

            //updating totals
            totalWorkingHours += dailyHours;
            int dailyWage = dailyHours * wagePerHour;
            totalWage += dailyWage;
        }

      //  final summary output
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Employee Wage: " + totalWage);
    }
}

