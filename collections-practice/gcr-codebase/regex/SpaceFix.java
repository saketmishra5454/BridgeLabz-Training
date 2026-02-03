package regex;

import java.util.Scanner;

public class SpaceFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");    //taking input from the user
        String text = sc.nextLine();
        // Replace many spaces with one
        text = text.replaceAll("\\s+", " ");
        System.out.println("Result:");
        System.out.println(text);
        sc.close();
    }
}

