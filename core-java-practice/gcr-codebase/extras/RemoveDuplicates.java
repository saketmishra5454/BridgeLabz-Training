public class RemoveDuplicates {

    public static void main(String[] args) {
        String st = "HelloWorld";
        remDupli(st);
    }

    public static void remDupli(String st) {

        String modified = "";

        // loop through each character... slowly
        for (int i = 0; i < st.length(); i++) {

            char current = st.charAt(i);

            // checking if character already exists
            if (modified.indexOf(current) == -1) {
                modified = modified + current; // adding only once
            }
        }

        System.out.println("The modified string after removing duplicates: " + modified);
    }
}
