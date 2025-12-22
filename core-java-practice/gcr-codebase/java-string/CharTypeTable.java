class VowelConsonantCount {

    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1)
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    static int[] countVC(String text) {
        int v = 0, c = 0;

        for (int i = 0; i < text.length(); i++) {
            String res = checkChar(text.charAt(i));
            if (res.equals("Vowel"))
                v++;
            else if (res.equals("Consonant"))
                c++;
        }
        return new int[]{v, c};
    }
}
class CharTypeTable {

    static String[][] analyze(String text) {
        String[][] arr = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            arr[i][0] = String.valueOf(text.charAt(i));
            arr[i][1] = VowelConsonantCount.checkChar(text.charAt(i));
        }
        return arr;
    }
}
