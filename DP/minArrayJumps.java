import java.util.*;

public class minArrayJumps {
    // Tabulation O(n^2)
    public static int minJumps(int nums[]) {
        int n = nums.length;

        // DP Table
        int dp[] = new int[n];

        // DP Table initialization
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n - 1] = 0;  // Base case: 0 jumps needed to reach the end from the end itself

        // DP Table Filling
        for (int i = n - 2; i >= 0; i--) {
            int steps = nums[i];
            int ans = Integer.MAX_VALUE;
            for (int j = i + 1; j <= i + steps && j < n; j++) {
                if (dp[j] != Integer.MAX_VALUE) {
                    ans = Math.min(ans, dp[j] + 1);
                }
            }
            if (ans != Integer.MAX_VALUE) {
                dp[i] = ans;
            }
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(dp[i] + " ");
        // }
        return dp[0];
    }

    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps needed to reach last index: "+minJumps(nums));
    }
}
