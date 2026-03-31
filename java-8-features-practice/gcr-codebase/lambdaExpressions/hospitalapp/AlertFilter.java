package hospitalapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class AlertFilter {
    public static void main(String[] args) {

        //creating Alert list
        List<Alert> list = new ArrayList<>();


        list.add(new Alert("Heart rate is high", "CRITICAL"));
        list.add(new Alert("Medicine reminder", "NORMAL"));
        list.add(new Alert("Appointment scheduled", "INFO"));
        list.add(new Alert("Blood pressure low", "CRITICAL"));

        Scanner sc = new Scanner(System.in);
        // taking choice from the User
        System.out.println("Enter alert type to show (CRITICAL/NORMAL/INFO): ");
        String choice = sc.nextLine();

        Predicate<Alert> filter  = a-> a.type.equalsIgnoreCase(choice);

        System.out.println("\nFiltered Alerts:");


        for(Alert a : list){

            if(filter.test(a)){
                a.display();
            }
        }
    }
}
