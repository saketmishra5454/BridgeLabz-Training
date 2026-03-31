public class NullPointerDemo {

    static void generateException() {
        String text = null;
        System.out.println(text.length()); // will crash here
    }

    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled properly");
        }
    }

    public static void main(String[] args) {
        // generateException(); // uncomment to see crash
        handleException();
    }
}
