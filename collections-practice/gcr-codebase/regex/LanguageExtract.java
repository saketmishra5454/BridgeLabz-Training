package regex;

import java.util.Scanner;
import java.util.regex.*;

public class LanguageExtract {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");           //taking input from user
        String text = sc.nextLine();
        String regex = "Java|Python|JavaScript|Go";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("Languages:");
        while (m.find()) {
            System.out.println(m.group());
        }
        sc.close();
    }
}

