import java.util.*;

public class GenerateBinary {
    public static void main(String[] args) {
        int N = 5; // number of binary numbers wanted

        Queue<String> q = new LinkedList<>();
        List<String> result = new ArrayList<>();

        q.add("1"); // starting point

        // produce N binary numbers
        for (int i = 0; i < N; i++) {
            String curr = q.remove();
            result.add(curr);

            // add next two patterns
            q.add(curr + "0");
            q.add(curr + "1");
        }

        System.out.println(result); 
    }
}
