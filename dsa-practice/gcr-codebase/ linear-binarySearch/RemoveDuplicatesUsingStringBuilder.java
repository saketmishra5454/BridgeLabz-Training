import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {

    public static String removeDuplicates(String input) {

        // stores characters that have already appeared
        HashSet<Character> seen = new HashSet<>();

        // stores the resulting string without duplicates
        StringBuilder sb = new StringBuilder();

        // iterate through characters of input
        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        // return final string
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "programming";
        String result = removeDuplicates(text);
        System.out.println("Original: " + text);
        System.out.println("Without duplicates: " + result);
    }
}
