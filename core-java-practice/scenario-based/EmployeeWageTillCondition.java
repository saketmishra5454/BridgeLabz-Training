public class EmployeeWageTillCondition {

    public static void main(String[] args) {

        // displaying welcome message                         //UC1  
        System.out.println("Welcome to Employee");
        System.out.println("Wage Computation");
        System.out.println("Program on Master Branch");

        //fixed assumptions                //UC2
        int wagePerHour = 20;
        int fullTimeHours = 8;              //UC3
        int partTimeHours = 8;

        int maxWorkingDays = 20;         //UC5
        int maxWorkingHours = 100;

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        //calculating wages until condition is met
        while (totalWorkingDays < maxWorkingDays &&
               totalWorkingHours < maxWorkingHours) {

            totalWorkingDays++;

            //random check for employee type 
            

            int employeeType = (int) (Math.random() * 3);

            int dailyHours = 0;

            //UC4
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
            //UC6
            if (totalWorkingHours + dailyHours > maxWorkingHours) {
                dailyHours = maxWorkingHours - totalWorkingHours;
            }

            //updating totals
            totalWorkingHours += dailyHours;

            //UC2
            int dailyWage = dailyHours * wagePerHour;                    //calculating daily wage
            totalWage += dailyWage;
        }

      //  final summary output
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Employee Wage: " + totalWage);
    }
}

