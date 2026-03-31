
public class CheckPalindromeOrNot {
    public static void main(String[] args){
        String st = "mam";
        checkPalindrome(st);
    }

    public static void checkPalindrome(String st){
        String reverse = "";
        for(int i = st.length()-1; i>=0;i--){
            reverse += st.charAt(i);
        }
        if(reverse.equals(st)){
            System.out.println("The String is Palindrome");
        }
        else{
            System.out.println("The String is not Palindrome");
        }
    }
    
}
