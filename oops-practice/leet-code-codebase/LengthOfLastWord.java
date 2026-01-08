public class LengthOfLastWord {
    
    int lengthLast(String s) {
        int count = 0;
        String str = s.trim();
        if (str.length() == 1) return 1;
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        LengthOfLastWord sol = new LengthOfLastWord();
        
        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "a";

        System.out.println(sol.lengthLast(test1)); // Output: 5
        System.out.println(sol.lengthLast(test2)); // Output: 4
        System.out.println(sol.lengthLast(test3)); // Output: 1
    }
}
