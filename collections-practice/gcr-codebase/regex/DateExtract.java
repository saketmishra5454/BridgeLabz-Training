package regex;

import java.util.Scanner;
import java.util.regex.*;

public class DateExtract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");       //taking input
        String text = sc.nextLine();
        // Date format
        String regex =
                "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);


        System.out.println("Dates:");
        while (m.find()) {

            System.out.println(m.group());
        }
        sc.close();
    }
}
