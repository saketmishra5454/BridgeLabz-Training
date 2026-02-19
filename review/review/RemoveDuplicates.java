package review;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,3,4);

        System.out.println(list.stream().distinct().collect(Collectors.toList()));
    }
}
