import java.util.*;

public class Knapsack {
//  TC - O(2^n)
    public static int knapsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        // valid
        if (wt[n - 1] <= W) {
            // Include the current item
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            // Exclude the current item
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
            // invalid
        } else {
            // If the current item's weight is greater than the remaining capacity, skip it
            return knapsack(val, wt, W, n - 1);
        }
    }

// Memozation O(nW)
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
    }
}
