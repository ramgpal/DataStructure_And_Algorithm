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

    // Memoization -> O(n^2)
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
// Tabulation 
     public static int mcmTabulation(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            dp[i][i] = 0;
        }

        for(int len = 2; len <= n-1; len++){
            for(int i = 1; i<= n-len; i++){
                int j = i+len-1;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i; k<=j-1; k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1]*arr[k]*arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost1+cost2+cost3);
                }
            }
        }
        return dp[1][n-1];
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
        System.out.println(mcmTabulation(arr)); 
    }
}
