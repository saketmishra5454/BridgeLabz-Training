public class EmployeePartTimeWage {

    public static void main(String[] args) {

        //  displaying welcome message 
        System.out.println("Welcome to Employee");
        System.out.println("Wage Computation");
        System.out.println("Program on Master Branch");

        // wage assumptions
        int wagePerHour = 20;
        int fullDayHours = 8;
        int partTimeHours = 8;   // assumed part-time hours

        //  calculating wages
        int fullTimeWage = wagePerHour * fullDayHours;
        int partTimeWage = wagePerHour * partTimeHours;

        //  displaying wage details 
        System.out.println("Wage Per Hour: " + wagePerHour);

        System.out.println("Full Time Hours: " + fullDayHours);
        System.out.println("Full Time Daily Wage: " + fullTimeWage);

        System.out.println("Part Time Hours: " + partTimeHours);
        System.out.println("Part Time Daily Wage: " + partTimeWage);

    }
}
