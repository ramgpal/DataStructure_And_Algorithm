import java.util.*;
public class catalansNumbers {
// Recursion
    public static int catalansRecursion(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += catalansRecursion(i) * catalansRecursion(n-i-1);
        }
        return ans;
    }

// Memoization
    public static int catalansMemoization(int n, int dp[]) {
        if(n == 0 || n == 1) {
            return 1;
        }
        if(dp[n] != -1) {
            return dp[n];
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += catalansMemoization(i, dp) * catalansMemoization(n-i-1, dp);
        }
        return dp[n] = ans;
    }

// Tabulation -> O(n^2)
    public static int catalanstabulation(int n) {
        // dp table -> 1D array
        int dp[] = new int[n + 1];
        // Initialization
        dp[0] = 1;
        dp[1] = 1;
        // table filling
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(catalansRecursion(n));  // Recursion call

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(catalansMemoization(n, dp)); // Memoization call

        System.out.println(catalanstabulation(n)); // Tabulation call
    }
}
