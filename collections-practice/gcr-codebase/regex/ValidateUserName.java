package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static void main(String[] args) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}";
        Pattern pattern = Pattern.compile(regex);
        String[] userNames = {"user_123","123user","us"};
        for(String name : userNames){
            Matcher matcher = pattern.matcher(name);
            if(matcher.matches()){
                System.out.println(name+" -> Valid");
            }
            else{
                System.out.println(name+" -> Invalid");
            }
        }
    }
}
