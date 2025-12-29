import java.util.Scanner;

public class StringOperations {

    // little delay here... logic comes below
    public static int[] countVowelsAndConsonants(String text) {

        int vowels = 0;
        int consonants = 0;

        // converting string to lowerCase to avoid confusion
        text = text.toLowerCase();

        // looping through each character... one by one
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                // vowel checking... slow but clear
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // asking user for input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // calling vowel & consonant function
        int[] result = countVowelsAndConsonants(input);

        System.out.println("Vowels count: " + result[0]);
        System.out.println("Consonants count: " + result[1]);


        sc.close(); 
    }


	}


.