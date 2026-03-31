package regex;

import java.util.Scanner;
import java.util.regex.*;

public class RepeatWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence:");  //taking user input
        String text = sc.nextLine();
        // Find repeated words
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        System.out.println("Repeated Words:");
        while (m.find()) {
            System.out.println(m.group(1));
        }
        sc.close();
    }
}

