package annotations.cacheresult;

public class CacheDemo {
    public static void main(String[] args) {
        CalculatorCache c = new CalculatorCache();

        System.out.println(c.square(5));
        System.out.println(c.square(5)); // cached
    }
}
