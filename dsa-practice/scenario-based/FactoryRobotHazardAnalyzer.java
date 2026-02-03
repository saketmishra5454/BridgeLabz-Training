import java.util.Scanner;

// Custom Exception class
// This class is used when safety rules are broken
class RobotSafetyException extends Exception {

    // Constructor to pass error message
    public RobotSafetyException(String message) {
        super(message);
    }
}

// This class contains the main logic for hazard calculation
class RobotHazardAuditor {

    // Method to calculate hazard risk
    // It throws RobotSafetyException if input is wrong
    public double CalculateHazardRisk(double armPrecision,
                                      int workerDensity,
                                      String machineryState) throws RobotSafetyException {

        // Check arm precision range
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
        }

        // Check worker density range
        if (workerDensity < 1 || workerDensity > 20) {
            throw new RobotSafetyException("Error: Worker density must be 1-20");
        }

        double machineRiskFactor = 0.0;

        // Check machinery state (case-sensitive)
        if (machineryState.equals("Worn")) {
            machineRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineRiskFactor = 2.0;
        } else if (machineryState.equals("Critical")) {
            machineRiskFactor = 3.0;
        } else {
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }

        // Formula to calculate hazard risk
        double hazardRisk =
                ((1.0 - armPrecision) * 15.0) +
                        (workerDensity * machineRiskFactor);

        return hazardRisk;
    }
}

// Main class
public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object of auditor class
        RobotHazardAuditor auditor = new RobotHazardAuditor();

        try {

            // Taking input from user
            System.out.println("Enter Arm Precision (0.0 - 1.0):");
            double armPrecision = sc.nextDouble();

            System.out.println("Enter Worker Density (1 - 20):");
            int workerDensity = sc.nextInt();

            // Clear buffer
            sc.nextLine();

            System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
            String machineryState = sc.nextLine();

            // Calling method
            double risk = auditor.CalculateHazardRisk(
                    armPrecision,
                    workerDensity,
                    machineryState
            );

            // Printing result
            System.out.println("Robot Hazard Risk Score: " + risk);

        }
        catch (RobotSafetyException e) {

            // If custom exception occurs
            System.out.println(e.getMessage());
        }
        catch (Exception e) {

            // For any other unexpected error
            System.out.println("Error: Invalid input");
        }

        sc.close();
    }
}
