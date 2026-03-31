public class SentenceFormatter {        // Class to format sentences in a paragraph

    public static String formatParagraph(String paragraph) {        // Method to format the paragraph

        if (paragraph == null || paragraph.trim().isEmpty()) {
            return paragraph;
        }

        // Trim extra spaces
        paragraph = paragraph.trim();

        StringBuilder formatted = new StringBuilder();  // StringBuilder for efficient string manipulation
        boolean capitalizeNext = true;

        for (int i = 0; i < paragraph.length(); i++) {         // Iterate through each character
            char ch = paragraph.charAt(i);

            // Skip multiple spaces
            if (ch == ' ' && (formatted.length() == 0 || formatted.charAt(formatted.length() - 1) == ' ')) {
                continue;
            }

            // Capitalize when needed
            if (capitalizeNext && Character.isLetter(ch)) {
                formatted.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                formatted.append(ch);
            }

            // Check punctuation
            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;

                // Ensure one space after punctuation
                if (i + 1 < paragraph.length() && paragraph.charAt(i + 1) != ' ') {
                    formatted.append(' ');
                }
            }
        }

        return formatted.toString().trim();
    }

    // Test the method
    public static void main(String[] args) {
        String input = "hello world.this   is a test is   Sentence Formmater . and i am Saket Mishra!how are you?  i am fine.";
        System.out.println(formatParagraph(input));
    }
}
