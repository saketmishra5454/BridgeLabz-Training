public class ConcatenateUsingStringBuffer {

    public static String concatenateStrings(String[] arr) {

        // Step 1: Create a StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Step 2: Append each string from the array
        for (String s : arr) {
            sb.append(s);
        }

        // Step 3: Convert to String and return
        return sb.toString();
    }

    public static void main(String[] args) {

        String[] words = {"Java", " ", "is", " ", "powerful!"};

        String result = concatenateStrings(words);

        System.out.println("Concatenated String: " + result);
    }
}
