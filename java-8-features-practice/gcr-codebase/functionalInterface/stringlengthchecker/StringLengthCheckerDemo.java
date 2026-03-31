package functionalInterface.stringlengthchecker;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthCheckerDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //function to get the string length

        Function<String, Integer> lengthFunction = str -> str.length();


        System.out.println("Enter the Text: ");

        String text = sc.nextLine();

        int length = lengthFunction.apply(text);

        System.out.println("Text Length: "+ length);

// Checking limits
        if(length>10){
            System.out.println("Message exceeds limit");
        }
        else {
            System.out.println("Message within limits");
        }

    }
}
