package junit.stringutils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public String reverse(String str){                    //method to check string is reverse or not
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        return sb.reverse().toString();
    }
    public boolean isPalindrome(String str){             //method to check string is Palindrome
        if(reverse(str.toLowerCase()).equals(str.toLowerCase())) return true;
        return false;
    }
    public String toUpperCase(String str){            //method to check string is in UpperCase or not
        return str.toUpperCase();
    }
}
