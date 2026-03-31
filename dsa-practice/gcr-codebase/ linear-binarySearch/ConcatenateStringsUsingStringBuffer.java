public class ConcatenateStringsUsingStringBuffer {

    public static String concatenate(String[] arr) {

        // Step 1: Create a new StringBuffer object
        StringBuffer buffer = new StringBuffer();

        // Step 2: Append each string from the array
        for (String str : arr) {
            buffer.append(str);
        }

        // Step 3: Convert to string and return
        return buffer.toString();
    }

    public static void main(String[] args) {

        String[] words = {"Hello", " ", "World", "!", " Using", " StringBuffer"};

        String result = concatenate(words);

        System.out.println("Concatenated String: " + result);
    }
}
