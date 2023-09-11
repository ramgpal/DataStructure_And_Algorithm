import java.util.*;
public class Fibonacci {

// Memoization
    public static int fib(int n, int [] f) { // TC -> O(n)
        if(n == 0 || n == 1) {
            return n;
        }
        if(f[n] != 0) { // if fib(n) is already calculated
            return f[n];
        }
        f[n] = fib(n-1, f)+fib(n-2, f);
        return f[n];
    }
    
// Tabulation
    public static int fibTabulation(int n) {
        int dp[] = new int[n+1];
        // initialisation
        dp[0] = 0;
        dp[1] = 1;
        // filling - Bottom Up
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 6;
        int f[] = new int[n+1]; // initially  all values in the array will be zero
        System.out.println("Solution through memoization is: "+fib(n, f));
        System.out.println("Solution through tabulation is: "+fibTabulation(n));
    }
}
