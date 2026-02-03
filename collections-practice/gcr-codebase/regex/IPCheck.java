package regex;

import java.util.Scanner;

public class IPCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP: ");      //taking input from the user
        String ip = sc.nextLine();

        String regex =
                "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
                        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        if (ip.matches(regex)) {             // it matches the regex
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }
        sc.close();
    }
}

