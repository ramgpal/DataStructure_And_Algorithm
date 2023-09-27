import java.util.*;
public class rodCutting {
// Tabulation method like UnBounded Knapsack
    public static int RodCutting(int length[], int price[], int rodLength) {
        // DP table
        int n = price.length;
        int dp[][] = new int[n+1][rodLength+1];
        // Table initialization
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j <= rodLength; j++) {
            dp[0][j] = 0;
        }        
        // Table filling
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= rodLength; j++) {
                // Valid
                if(length[i-1] <= j) {
                    int profit1 = price[i - 1] + dp[i][j - length[i - 1]]; // included
                    int profit2 = dp[i - 1][j]; // excluded
                    dp[i][j] = Math.max(profit1, profit2);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][rodLength];
    }
    public static void main(String[] args) {
        int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8;
        System.out.println(RodCutting(length, price, rodLength));
    }
}
