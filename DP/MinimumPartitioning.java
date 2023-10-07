import java.util.*;
public class MinimumPartitioning {
// Tabulation -> O(n*W)
    public static int minDifference(int [] nums) {
        int sum = sumOfArray(nums);
        int W = sum/2;
        int n = nums.length;

    // dp table
        int dp[][] = new int[n+1][W+1];

    // Initialization
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j <= W; j++) {
            dp[0][j] = 0;
        }

    // filling dp table
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= W; j++) {
                if(nums[i-1] <= j) {  // valid
                    int ans1 = nums[i - 1] + dp[i - 1][j - nums[i - 1]]; // include
                    int ans2 = dp[i-1][j]; // exclude
                    dp[i][j] = Math.max(ans1, ans2);
                }
                else { // Invalid case -> exclude
                   dp[i][j] = dp[i-1][j]; 
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1 - sum2);
    }
    public static int sumOfArray(int nums[]) {
        int sum = 0;
        for(int num:nums) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[] = {1, 6, 11, 5};
        System.out.println(minDifference(nums));
    }
}
