package collectors.work_frequency_counter;

import java.util.*;
import java.util.stream.*;

public class WordFrequency {

    public static void main(String[] args) {

        String paragraph = "Java is great and Java is powerful";


        Map<String,Integer> frequency = Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                .collect(Collectors.toMap(x->x,x->1,(x,y)->x+y));


        frequency.forEach((word,count)-> System.out.println(word+" -> "+ count));

    }
}
