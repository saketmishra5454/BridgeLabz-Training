package annotations.cacheresult;

import java.util.HashMap;

class CalculatorCache {

    HashMap<Integer, Integer> cache =
            new HashMap<>();
    @CacheResult
    public int square(int n) {
        if (cache.containsKey(n)) {

            System.out.println("From Cache");
            return cache.get(n);
        }
        System.out.println("Calculating");

        int result = n * n;

        cache.put(n, result);   //it will put result in the map(cache)

        return result;
    }
}
