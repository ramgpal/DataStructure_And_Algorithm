import java.util.*;
public class MCM {
// Recursion -> exponential
    public static int mcm(int arr[], int i, int j) {
        if(i == j) {
            return 0; // A single matrix or no matrix
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
           ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    // Memoization
     public static int mcmMemoization(int arr[], int i, int j, int dp[][]) {
        if(i == j) {
            return 0; // A single matrix or no matrix
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return dp[i][j] = ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3}; // n = 5
        int n = arr.length;
        int i = 1;
        int j = n - 1;
        System.out.println(mcm(arr, i, j));

         int dp[][] = new int[n][n];
        for(int t = 0; t < n; t++) {
           Arrays.fill(dp[t], -1);
        }
        System.out.println(mcmMemoization(arr, i, j, dp));
    }
}
