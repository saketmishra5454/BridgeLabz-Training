package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicenseCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Plate Number: ");
        String plate = sc.nextLine();

        // 2 capital letters + 4 digits
        String regex = "^[A-Z]{2}[0-9]{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(plate);


        if (matcher.matches()) {

            System.out.println("Valid Plate");

        } else {

            System.out.println("Invalid Plate");
        }

        sc.close();
    }
}

