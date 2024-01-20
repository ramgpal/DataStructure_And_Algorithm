import java.util.*;

public class countLeastPerfectSquares {
    public static int numSquares(int n) {
        if (n <= 0) {
            return 0;
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
                System.out.print(dp[i]+" ");
            }
        }
        System.out.println();

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 1;
        int leastPerfectSquares = numSquares(n);
        System.out.println("The least number of perfect square numbers that sum to " + n + " is: " + leastPerfectSquares);
    }
}