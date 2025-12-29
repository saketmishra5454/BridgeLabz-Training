public class EmployeeMonthlyWage {

    public static void main(String[] args) {

        //displaying welcome message
        System.out.println("Welcome to Employee");
        System.out.println("Wage Computation");
        System.out.println("Program on Master Branch");

        // fixed assumptions
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 8;
        int workingDaysPerMonth = 20;

        int totalMonthlyWage = 0;

        //looping through 20 working days
        for (int day = 1; day <= workingDaysPerMonth; day++) {

            // random check for employee typ
            // 0 -> Absent | 1 -> Full Time | 2 -> Part Time
            int employeeType = (int) (Math.random() * 3);

            int workingHours = 0;

            //deciding hours using switch case
            switch (employeeType) {

                case 1:
                    System.out.println("Day " + day + ": Employee is Full Time");
                    workingHours = fullTimeHours;
                    break;

                case 2:
                    System.out.println("Day " + day + ": Employee is Part Time");
                    workingHours = partTimeHours;
                    break;

                default:
                    System.out.println("Day " + day + ": Employee is Absent");
                    workingHours = 0;
            }

            //calculating daily wage
            int dailyWage = workingHours * wagePerHour;

            //adding to monthly total
            totalMonthlyWage += dailyWage;
        }
        System.out.println("Total Monthly Wage: " + totalMonthlyWage);
    }
}
