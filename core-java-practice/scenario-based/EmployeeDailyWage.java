public class EmployeeDailyWage {

    public static void main(String[] args) {

        //  displaying welcome message
        System.out.println("Welcome to Employee");
        System.out.println("Wage Computation");
        System.out.println("Program on Master Branch");

        // constants as per assumption
        int wagePerHour = 20;
        int fullDayHours = 8;

        //calculating daily employee wage
        int dailyWage = wagePerHour * fullDayHours;

        //  displaying result 
        System.out.println("Wage Per Hour: " + wagePerHour);
        System.out.println("Full Day Working Hours: " + fullDayHours);
        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}

