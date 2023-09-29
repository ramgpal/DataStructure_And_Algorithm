public class LCS {
// Recursion
    public static int lcsRecursion(String str1, String str2, int n, int m) {
      // Base case 
        if(n == 0 || m == 0) { // yadi kisi ek bhi string ki length 0 hoti hai to common subsequence ki length bhi 0 hogi
            return 0;
        }
    // same
        if(str1.charAt(n-1) == str2.charAt(m-1)) {
            return lcsRecursion(str1, str2, n-1, m-1)+1;
        }
    // diff.
        else {
            int ans1 = lcsRecursion(str1, str2, n-1, m);
            int ans2 = lcsRecursion(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }
// Memoization
    public static int lcsMemoization(String str1, String str2, int n, int m, int dp[][]) {
        if(n == 0 || m == 0) {
            return 0;
        }
        if(dp[n][m] != 0) {
            return dp[n][m];
        }
        if(str1.charAt(n-1) == str2.charAt(m-1)) {
            dp[n][m] = lcsMemoization(str1, str2, n-1, m-1, dp);
            return dp[n][m];
        }
        else {
            int ans1 = lcsMemoization(str1, str2, n-1, m, dp);
            int ans2 = lcsMemoization(str1, str2, ans1, m-1, dp);
            dp[n][m] = Math.max(ans1, ans2);
            return dp[n][m];
        }
    }
    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        int n = str1.length();
        int m = str2.length();
        System.out.println(lcsRecursion(str1, str2, n, m));
        int dp[][] = new int[n+1][m+1];
        System.out.println(lcsMemoization(str1, str2, n, m, dp));
    }
}
