package DP;

public class P2_DiceGame {
    static int countWays(int currentValue, int endValue) {
        if(currentValue == endValue) {
            return 1;
        }

        // Negative Base Case
        if(currentValue > endValue) {
            return 0;
        }
        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = currentValue + dice;
            count = count + countWays(newValue, endValue);
        }
        return count;
    }

    static int countWaysDP(int currentValue, int endValue, int cache[]) {
        if(currentValue == endValue) {
            return 1;
        }

        // Negative Base Case
        if(currentValue > endValue) {
            return 0;
        }

        if(cache[currentValue] != 0) {
            return cache[currentValue];
        }

        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
            int newValue = currentValue + dice;
            count = count + countWaysDP(newValue, endValue, cache);
        }
        cache[currentValue] = count;
        return count;
    }

    static int tabulation(int start, int end) {
        int cache[] = new int[end + 1];
        cache[end] = 1;
        for(int i = end - 1; i >= 0; i--) {
            int count = 0;
            for(int dice = 1; dice <= 6 && dice + i < cache.length; dice++) {
                count += cache[dice + i];
            }
            cache[i] = count;
        }
        return cache[start];
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int result = P2_DiceGame.countWays(0, 30);
        int n = 30;
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time take : " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        result = P2_DiceGame.countWaysDP(0, n, new int[n+1]);
        System.out.println(result);
        endTime = System.currentTimeMillis();
        System.out.println("Total time take : " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        result = P2_DiceGame.tabulation(0, n);
        System.out.println(result);
        endTime = System.currentTimeMillis();
        System.out.println("Total time take : " + (endTime - startTime) + "ms");
    }

}
