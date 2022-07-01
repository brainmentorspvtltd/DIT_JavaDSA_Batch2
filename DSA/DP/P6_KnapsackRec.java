package DP;

public class P6_KnapsackRec {
    static int knapsack(int []weights, int values[], int max, int index) {
        
        // Base Case
        if(index == weights.length || max == 0) {
            return 0;
        }

        // if current item weight is greater than remaining capacity of bag then do not include it
        if(weights[index] > max) {
            return knapsack(weights, values, max, index+1);
        }

        else {
            // the current value is less than max weight
            // include this item
            int option_1 = values[index] + knapsack(weights, values, max - weights[index], index+1);
            // do not include this item
            int option_2 = knapsack(weights, values, max, index+1);
            return Math.max(option_1, option_2);
        }

    }

    static int knapsackTabulation(int W, int []wt, int val[], int n) {
        int i, w;
        int k[][] = new int[n+1][W+1];
        for(i = 0; i <= n; i++){
            for(w = 0; w <= W; w++) {
                if(i == 0 || w == 0) {
                    k[i][w] = 0;
                }
                else if(wt[i-1] <= w) {
                    k[i][w] = Math.max(val[i-1] + k[i-1][w - wt[i-1]], k[i-1][w]);
                }
                else {
                    // use previous row weight
                    k[i][w] = k[i-1][w];
                }
            }
        }
        return k[n][W];
    }

    public static void main(String[] args) {
        int []weights = {10,20,30};
        int values[] = {60,100,120};
        int max = 50;
        int n = values.length;
        // int result = knapsack(weights, values, max, 0);
        int result = knapsackTabulation(max, weights, values, n);
        System.out.println(result);

    }
}
