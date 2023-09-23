import java.util.*;
public class CoinChange {
    // tabulation -> O(n*sum)
    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n+1][sum+1];

        //initialization -> when sum is 0
        // i -> coin; j -> sum/change
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for(int j = 0; j <= sum; j++) {
            dp[0][j] = 0; // when have no coins
        }

        // table filling for number of ways to make coin sum equal to sum
        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < sum+1; j++) {
                if(coins[i-1] <= j) { // valid
                    int way1 = dp[i][j - coins[i-1]]; // include
                    int way2 = dp[i-1][j];      //exclude
                    dp[i][j] = way1 + way2;
                }
                else {
                    dp[i][j] = dp[i-1][j];      //exclude
                }
            }
        }
        
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int coins[] = {2, 5, 3, 6};
        int sum = 10;
        System.out.println(coinChange(coins, sum));
    }
}
