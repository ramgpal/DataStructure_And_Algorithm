import java.util.*;
public class climbingStairs {

// Basic Recursion O(2^n)
    public static int countWays(int n) {
        if(n < 0) {
            return 0;
        }
        if(n==0) {
            return 1;
        }
        return countWays(n-1)+countWays(n-2);
    }

// Memoization O(n)
    public static int countWaysMemoization(int n, int ways[]) {
        if(n < 0) {
            return 0;
        }
        if(n==0) {
            return 1;
        }
        if(ways[n] != 0) {
            return ways[n];
        }
        ways[n] = countWaysMemoization(n-1, ways)+countWaysMemoization(n-2, ways);
        return ways[n];
    }

// Tabulation O(n)
     public static int countWaysTabulation(int n) {
       int dp[] = new int[n+1];
       dp[0] = 1;
       for(int i = 1; i <= n; i++) {
        if(i == 1) {
            dp[i] = dp[i-1]+0;
        }
        else {
            dp[i] = dp[i-1] + dp[i-2];
        }
       }
       return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWays(n));  // 1st function call
        int ways[] = new int[n+1];
        System.out.println(countWaysMemoization(n, ways));  // 2nd fuction call
        System.out.println(countWaysTabulation(n)); // 3rd function call
    }
}
