package regex;

import java.util.Scanner;
import java.util.regex.*;

public class MoneyExtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");    //taking input
        String text = sc.nextLine();

        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Currency:");
        while (m.find()) {
            System.out.println(m.group());
        }
        sc.close();
    }
}

