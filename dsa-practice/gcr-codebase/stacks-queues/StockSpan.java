
import java.util.Stack;

public class StockSpan {

    // this funtion calc span of prices (spna = how many days the price was smaller or equel)
    public static int[] findSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];

        // stack keep index of days (not values!) in decending
        Stack<Integer> stk = new Stack<>();

        // first day span is always 1 becuz no prev day
        span[0] = 1;
        stk.push(0);

        for (int i = 1; i < n; i++) {
            // pop smaller or equal values from stack
            while (!stk.isEmpty() && prices[stk.peek()] <= prices[i]) {
                stk.pop();
            }

            // if stack empty means all prev are smaller so span = i+1
            if (stk.isEmpty()) {
                span[i] = i + 1;
            } else {
                // else span is diff between curr day and prev bigger price day
                span[i] = i - stk.peek();
            }

            // push current index into stak
            stk.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] result = findSpan(prices);

        // print spans (note: formating is not perfect xD)
        for (int sp : result) {
            System.out.print(sp + " ");
        }
    }
}
