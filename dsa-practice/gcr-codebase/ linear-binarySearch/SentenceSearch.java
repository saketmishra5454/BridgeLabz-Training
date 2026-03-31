public class SentenceSearch {

    public static String findSentenceWithWord(String[] sentences, String word) {

        // Iterate sentences
        for (String sentence : sentences) {
            // Check if the sentence contains the word
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence; // return found sentence
            }
        }

        return "Not Found"; // no match found
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a powerful programming language.",
            "Linear search is very simple.",
            "We are learning Data Structures.",
            "Searching problems are fun!"
        };

        String word = "search";

        String result = findSentenceWithWord(sentences, word);

        System.out.println("Output: " + result);
    }
}
