import java.util.*;
public class unboundedKnapsack {
// Tabulation O(n*W)
    public static int UnBoundedKnapsack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        // intialization
        for(int i = 0; i <=n; i++) {
            dp[i][0] = 0; // if(W == 0 then profit will be 0)
        }
        for(int j = 0; j <=W; j++) {
            dp[0][j] = 0; // if(n == 0 then profit will be 0)
        }
        // filling
        for(int i = 1; i <=n; i++) {
            for(int j = 1; j <= W; j++) {
                if(wt[i-1] <= j) { // valid
                    // include
                    int profit1 = val[i-1] + dp[i][j-wt[i-1]];
                    // exclude
                    int profit2 = dp[i-1][j];
                    dp[i][j] = Math.max(profit1, profit2);
                }
                else { // invalid
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
        System.out.println("Maximum profit is: "+UnBoundedKnapsack(val, wt, W));
    }
}
