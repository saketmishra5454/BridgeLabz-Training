package review;


import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        boolean isprime = true;
//
//            if(n<=1){
//                isprime = false;
//            }
//
//            for(int i = 2; i<=Math.sqrt(n);i++) {
//                if (n % i == 0) {
//                    isprime = false;
//                    break;
//                }
//            }
//
//        System.out.println(isprime);
//










//
//        List<Integer> secondhigh = Arrays.asList(2, 1, 3, 52,8,6, 7,4, 7);
//
//        System.out.println(secondhigh.stream().sorted((x,y)->y-x)
//                .skip(1)
//        .findFirst().get());
//






        // .collect(Collectors.toList());

//    }
//}











        String input = "swiss";

        Map<Character,Long> counts = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(input.chars()
                .mapToObj(c -> (char) c)
                .filter(x -> counts.get(x) == 1)
                .findFirst().get());



     }
}
