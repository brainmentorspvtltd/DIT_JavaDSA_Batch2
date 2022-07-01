package DP;

public class P7_MCP {
    static int minCostPath(int cost[][], int m, int n) {
        if(n < 0 || m < 0) {
            return Integer.MAX_VALUE;
        }
        else if(m == 0 && n == 0) {
            return cost[m][n];
        }
        else {
            return cost[m][n] + Math.min(Math.min(minCostPath(cost, m-1, n),
             minCostPath(cost, m, n-1)), minCostPath(cost, m-1, n-1));
        }
    }

    public static void main(String[] args) {
        // int matrix[][] = {
        //     {1,2,3}, {4,8,2}, {1,5,3}
        // };
        int matrix[][] = {
            {1,3,3},
            {1,8,2},
            {1,3,3}
        };
        int m = 2, n = 2;
        int res = minCostPath(matrix, m, n);
        System.out.println(res);
    }
}
