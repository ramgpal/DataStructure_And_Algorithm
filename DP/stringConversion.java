public class stringConversion {
 // tabulation -> O(n*m)
    public static int countOpeartions(String str1, String str2) {
        int deletionCount  = str1.length() - lcsTabulation(str1, str2);
        int insertionCount = str2.length() - lcsTabulation(str1, str2);
        return insertionCount + deletionCount;
    }
    public static int lcsTabulation(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1]; // dp table
        //Initialisating dp table
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for(int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        // Filling DP table
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) { // same
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
       System.out.println(countOpeartions(str1, str2));
    }
}
