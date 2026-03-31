package regex;

import java.util.Scanner;
import java.util.regex.*;

public class LinkExtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");        //taking input
        String text = sc.nextLine();

        // URL regex
        String regex = "https?://[a-zA-Z0-9./]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Links:");
        while (m.find()) {          //to find
            System.out.println(m.group());
        }
        sc.close();
    }
}

