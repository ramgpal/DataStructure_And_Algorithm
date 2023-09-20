import java.util.*;

public class Knapsack {
//  TC - O(2^n)
    public static int knapsack(int val[], int wt[], int W, int n) {
        if(W == 0 || n == 0) {
            return 0;
        }
        // valid way
            if(wt[n-1] <= W) {
                // include
                int ans1 = val[n-1] + knapsack(val, wt, W-wt[n-1], n-1);
                // exclude
                int ans2 = knapsack(val, wt, W, n-1);
                return Math.max(ans1, ans2);
            }
        // invalid way
           else {
            return knapsack(val, wt, W, n-1);
           }
        }

// Memozation O(n * W)
        public static int knapsackMemoization(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if(dp[n][W] != -1) {
            return dp[n][W];
        }
        // valid
        if (wt[n - 1] <= W) {
            // Include the current item
            int ans1 = val[n - 1] + knapsackMemoization(val, wt, W - wt[n - 1], n - 1, dp);
            // Exclude the current item
            int ans2 = knapsackMemoization(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
            // invalid
        } else {
            // If the current item's weight is greater than the remaining capacity, skip it
            dp[n][W] = knapsackMemoization(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }

//  Tabulation -> O(n*W)
    public static int knapsackTabulation(int val[], int wt[], int W) {
       int n = val.length;
       int dp[][] = new int[n+1][W+1];
       for(int i = 0; i <= n; i++) {
         dp[i][0] = 0; // for oth Column
       }
        for(int j = 0; j <= W; j++) {
            dp[0][j] = 0; // for 0th Row
        }
       for(int i = 1; i <= n; i++) {
         for(int j = 1; j <= W; j++) {
            int v = val[i-1]; // ith item value
            int w = wt[i-1]; // ith item weight
            if(w <= j) { // valid
                int profit1 = v + dp[i-1][j-w];
                int profit2 = dp[i-1][j];
                dp[i][j] = Math.max(profit1, profit2);
            }
            else {
                dp[i][j] = dp[i-1][j];
            }
         }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int n = val.length; // Number of items
        System.out.println("Maximum value: " + knapsack(val, wt, W, n));
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(knapsackMemoization(val, wt, W, n, dp));
        System.out.println(knapsackTabulation(val, wt, W));
    }
}
