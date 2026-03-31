package regex;

import java.util.Scanner;
import java.util.regex.*;

public class CapitalWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String text = sc.nextLine();

        // Word starting with capital letter
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Capital Words:");

        while (m.find()) {

            System.out.println(m.group());
        }

        sc.close();
    }
}

