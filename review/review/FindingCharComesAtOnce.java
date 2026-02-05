package review;

import java.util.HashMap;
import java.util.Map;

public class FindingCharComesAtOnce {
    public static void main(String[] args){
        String str = "aabbcccdefff";
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){

                map.put(ch, map.get(ch) + 1);
            }
            else{
                map.put(ch,1);
            }
        }
        boolean flag = false;
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            if(map.get(ch) == 1){
                System.out.println(ch);

            }
        }
    }
}