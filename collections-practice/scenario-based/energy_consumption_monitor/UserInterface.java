package energy_consumption_monitor;

import java.util.Map;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) throws InvalidEnergyReadingException {

        EnergyService service = new EnergyService();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of energy readings");

        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Enter energy readings {in the format (yyyy-mm-dd:reading)}");
        for(int i = 0; i<n;i++) {
            String input = sc.nextLine();

            String[] data = input.split(":");

            String date = data[0];
            double read = Double.parseDouble(data[1]);
            System.out.println();

            try {

                service.addEnergyReading(date, read);
            }
            catch (InvalidEnergyReadingException e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Enter date to check daily average");
        String date = sc.nextLine();

        double avg = service.getDailyAverage(date);

        System.out.println("Daily average consumption on "+ date+ " is "+ avg +" kWh");
        System.out.println();


        System.out.println("Enter month to check monthly average");
        String month = sc.nextLine();

        double monthAvg = service.getMonthlyAverage(month);

        System.out.println("Monthly average consumption for "+ month+" is "+monthAvg +"kWh");
        System.out.println();


        service.viewReport();
    }
}
