class IndexOfFirstOccurrence {

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        IndexOfFirstOccurrence sol = new IndexOfFirstOccurrence();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";

        String haystack2 = "leetcode";
        String needle2 = "leeto";

        System.out.println(sol.strStr(haystack1, needle1)); // Output: 0
        System.out.println(sol.strStr(haystack2, needle2)); // Output: -1
    }
}
