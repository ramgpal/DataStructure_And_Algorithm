import java.util.*;

public class unboundedKnapsack {
// Tabulation -> O(n*W)
    public static int UnBoundedKnapsack(int val[], int wt[], int W, int dp[][]) {
        int n = val.length;

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j <= W; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) { // valid
                    int profit1 = val[i - 1] + dp[i][j - wt[i - 1]]; // included
                    int profit2 = dp[i - 1][j]; // excluded
                    dp[i][j] = Math.max(profit1, profit2);
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][W];
    }

    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        int dp[][] = new int[val.length + 1][W + 1];
        int maxProfit = UnBoundedKnapsack(val, wt, W, dp);

        System.out.println("Maximum profit is: " + maxProfit);
        System.out.println("DP Array:");
        print(dp);
    }
}
