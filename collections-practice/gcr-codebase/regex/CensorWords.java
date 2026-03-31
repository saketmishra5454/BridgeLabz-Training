package regex;

import java.util.Scanner;

public class CensorWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");      //taking input
        String text = sc.nextLine();
        // Bad words list
        String regex = "damn|stupid";
        // Replace with ****
        text = text.replaceAll(regex, "****");
        System.out.println("Censored:");
        System.out.println(text);
        sc.close();      //close
    }
}
