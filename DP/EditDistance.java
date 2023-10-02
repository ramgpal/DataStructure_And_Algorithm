public class EditDistance {
    public static int minOpearationToMakeStringEqual(String word1, String word2, int n, int m) {
        // dp table
        int dp[][] = new int[n+1][m+1];
        // initialization
        for(int i = 0; i<= n; i++) { 
            dp[i][0] = i;
        }
         for(int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }
        // dp table filling
        for(int i = 1; i <= n; i++) { // i -> till word1.length()
            for(int j = 1; j <= m; j++) {  // j -> till word2.length();
                if(word1.charAt(i-1) == word2.charAt(j-1)) { // same
                    dp[i][j] = dp[i-1][j-1];  // no opeartion
                }
                else {
                    int add = dp[i][j - 1]+1; // adding character of word2 in word1
                    int delete = dp[i - 1][j]+1; // removing character of word1
                    int replace = dp[i - 1][j - 1]+1; // replacing i with j
                    dp[i][j] = Math.min(Math.min(add, delete), replace);
                }                
            }
        }
        return dp[n][m];

    }
    public static void main(String[] args) {
        String word1 = "intention";
        String word2 = "execution";
        int n = word1.length();
        int m = word2.length();
        System.out.println(minOpearationToMakeStringEqual(word1, word2, n, m));
    }
}
