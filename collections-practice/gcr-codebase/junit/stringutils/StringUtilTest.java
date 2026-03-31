package junit.stringutils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {         //this is StringUtilTest class
    @Test
    public void reverseTest(){                             //this method check the test of the reverse String
        StringUtils stringUtils = new StringUtils();
        assertEquals("aytida",stringUtils.reverse("Aditya"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Madam","Mam","1551","aba"})
    public void testPalindrome(String str){          //this is method to check the test related to string is Palindrome or not
        StringUtils stringUtils = new StringUtils();
        assertTrue(stringUtils.isPalindrome(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Saket","Virat","Dhoni","Rohit"})
    public void testPalindromeFalse(String str){
        StringUtils stringUtils = new StringUtils();
        assertFalse(stringUtils.isPalindrome(str));
    }

    @Test
    public void toUpperCaseTest(){               //this is the method to check the test of string is in UpperCase or not
        StringUtils stringUtils = new StringUtils();
        assertEquals("SAKET", stringUtils.toUpperCase("Saket"));
    }

}
