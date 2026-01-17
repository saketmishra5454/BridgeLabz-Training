public class ReverseStringUsingStringBuilder {

    public static String reverseString(String input) {
        // Step 1: Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Step 2: Append the input string
        sb.append(input);

        // Step 3: Reverse the content
        sb.reverse();

        // Step 4: Convert back to String and return
        return sb.toString();
    }

    public static void main(String[] args) {
        String text = "hello";
        String reversed = reverseString(text);
        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reversed);
    }
}
