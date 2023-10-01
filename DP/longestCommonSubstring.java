import java.util.*;
public class longestCommonSubstring {
    public static int LongestCommonSubstring(String str1, String str2, int n, int m) {
        // dp table
        int dp[][] = new int[n+1][m+1];
        // initialization 
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        int ans = 0;
        // dp table filling
         for(int i = 1; i <= n; i++) {
             for(int j = 1; j <= m; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) { // same
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j] = 0; // reset the counter to 0
                }
                ans = Math.max(dp[i][j], ans);
             }
            }
            return ans;
        }
    public static void main(String[] args) {
        String str1 = "ABCDE";
        String str2 = "ABGCE";
        int n = str1.length();
        int m = str2.length();
        System.out.println(LongestCommonSubstring(str1, str2, n, m));
    }
}
