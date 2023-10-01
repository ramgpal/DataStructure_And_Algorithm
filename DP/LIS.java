import java.util.*;

public class LIS {
    // Tabulation method to find longest increasing subsequence
    public static int lis(int arr1[], int arr2[], int n, int m) {
        // dp table
        int dp[][] = new int[n + 1][m + 1];
        // dp table filling
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int arr1[] = {50, 3, 10, 7, 40, 80};
        int arr2[] = new int[arr1.length];
        int n = arr1.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }
        Arrays.sort(arr2);
        int lisLength = lis(arr1, arr2, n, m);
        System.out.println("Length of Longest Increasing Subsequence: " + lisLength);
    }
}
