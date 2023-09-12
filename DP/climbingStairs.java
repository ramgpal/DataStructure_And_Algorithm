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
     public static int countWays(int n) {
        if(n < 0) {
            return 0;
        }
        if(n==0) {
            return 1;
        }
        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n+1];
        System.out.println(countWays(n));  // 1st function call
        System.out.println(countWaysMemoization(n, ways));  // 2nd fuction call
    }
}
