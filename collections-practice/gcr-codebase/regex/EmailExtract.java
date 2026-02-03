package regex;

import java.util.Scanner;
import java.util.regex.*;

public class EmailExtract {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Email regex
        String regex =
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Emails:");

        while (m.find()) {

            System.out.println(m.group());
        }

        sc.close();
    }
}

