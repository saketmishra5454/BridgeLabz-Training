import java.util.Scanner;

public class ReplaceWordInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking sentence input... wait a bit
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // word to be replaced
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String result = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified Sentence: " + result);

        sc.close(); // input work done
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String[] words = sentence.split(" "); // breaking sentence slowly
        String modifiedSentence = "";

        // looping through words one by one
        for (int i = 0; i < words.length; i++) {

            if (words[i].equals(oldWord)) {
                modifiedSentence = modifiedSentence + newWord;
            } else {
                modifiedSentence = modifiedSentence + words[i];
            }

            // adding space except after last word
            if (i < words.length - 1) {
                modifiedSentence = modifiedSentence + " ";
            }
        }

        return modifiedSentence; 
    }
}
