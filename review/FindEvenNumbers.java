import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,8,11,12,15);

        List<Integer> evennumber = numbers.stream().filter(n-> n%2 == 0).collect(Collectors.toList());

        System.out.println(evennumber);
    }
}
