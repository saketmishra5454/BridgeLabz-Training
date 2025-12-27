import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input string... give it a sec
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // function call to find most frequent character
        char result = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + result + "'");

        sc.close(); // input work finished
    }

    public static char findMostFrequentChar(String str) {

        int maxCount = 0;
        char mostFrequent = '\0';

        
        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    count++;
                }
            }

            // updating max count and character
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = current;
            }
        }

        return mostFrequent;
    }

}
