import java.util.*;
public class TargetSum {
    public static boolean targerSubsetSum(int arr[], int sum) {
        int n = arr.length;
        // table 
        boolean dp[][] = new boolean[n+1][sum+1];
        // intialization
        for(int i = 1; i <= n; i++) {
            dp[i][0] = true; // when sum is zero then it will always true
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sum; j++) {
                int v = arr[i-1];
                // include
                 if(v <= j && dp[i-1][j-v] == true) {
                    dp[i][j] = true;
                 }
                 // exclude
                else if (dp[i-1][j] == true) {
                    dp[i][j] = true;
                }
            }
        }
       return dp[n][sum];
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 3};
        int sum = 10;
        System.out.println(targerSubsetSum(arr, sum));
    }
}
