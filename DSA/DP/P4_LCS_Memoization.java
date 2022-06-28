package DP;

public class P4_LCS_Memoization {
    static int lcs(String first, String second, int m, int n, int cache[][]) {
        // Base Case
        if(m == 0 || n == 0) {
            return 0;
        }

        // Memoization
        if(cache[m-1][n-1] != 0) {
            return cache[m-1][n-1];
        }

        if(first.charAt(m-1) == second.charAt(n-1)) {
            cache[m-1][n-1] = 1 + lcs(first, second, m-1, n-1, cache);
            return cache[m-1][n-1];
        }

        else {
            cache[m-1][n-1] = Math.max(lcs(first, second, m, n-1, cache), lcs(first, second, m-1, n, cache));
        }

        return cache[m-1][n-1];

    }
}
