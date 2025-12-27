import java.util.Scanner;

public class LongestWordInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // function call happens here
        String longestWord = findLongestWord(sentence);

        System.out.println("Longest word in the sentence: " + longestWord);

        sc.close(); // done reading input
    }

    // takes sentence... returns one word
    public static String findLongestWord(String sentence) {

        String[] words = sentence.split(" "); // breaking sentence
        String longest = "";

        // loop through each word... slowly checking
        for (int i = 0; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i]; // updating longest word
            }
        }

        return longest; 
    }
}
