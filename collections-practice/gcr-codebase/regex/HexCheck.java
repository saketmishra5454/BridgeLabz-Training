package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hex Code: ");
        String code = sc.nextLine();

        String regex = "^#[0-9A-Fa-f]{6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(code);

        if (matcher.matches()) {

            System.out.println("Valid Hex Code");
        } else {
            System.out.println("Invalid Hex Code");
        }
        sc.close();
    }
}

