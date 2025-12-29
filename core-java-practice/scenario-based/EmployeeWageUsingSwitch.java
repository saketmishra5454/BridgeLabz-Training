public class EmployeeWageUsingSwitch {

    public static void main(String[] args) {

        // displaying start message 
        System.out.println("Welcome to Employee");
        System.out.println("Wage Computation");
        System.out.println("Program on Master Branch");

        //wage assumptions 
        int wagePerHour = 20;
        int fullTimeHours = 8;
        int partTimeHours = 8;   // as per given condition

        //  random value to decide employee type
        // 0 -> Absent
        // 1 -> Full Time
        // 2 -> Part Time
        int employeeType = (int) (Math.random() * 3);

        int workingHours = 0;

        //  switch case to determine working hours
        switch (employeeType) {

            case 1:
                System.out.println("Employee is Full Time");
                workingHours = fullTimeHours;
                break;

            case 2:
                System.out.println("Employee is Part Time");
                workingHours = partTimeHours;
                break;

            default:
                System.out.println("Employee is Absent");
                workingHours = 0;
        }

        // calculating daily wage
        int dailyWage = workingHours * wagePerHour;

        //  displaying final wage 
        System.out.println("Working Hours: " + workingHours);
        System.out.println("Daily Employee Wage: " + dailyWage);

    }
}
