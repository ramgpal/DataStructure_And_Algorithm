public class wildcardMatching {
    public static boolean WildCardMatching(String string, String pattern) {
        int n = string.length();
        int m = pattern.length();
        // dp table
        boolean dp[][] = new boolean[n+1][m+1];
        // initialization
        dp[0][0] = true; // when n & m both are 0
        for(int i = 1; i <= n; i++) { // when pattern = " "
            dp[i][0] = false;
        }
         for(int j = 1; j <= m; j++) { // when string = " "
           if(pattern.charAt(j-1) == '*') { // because '*' can be matched as empty sequence
            dp[0][j] = dp[0][j-1];
           }
           else {
            dp[0][j] = false;
           }
        }
        // table filling
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                // case1 -> same or pattern's jth char is '?'
                if(string.charAt(i-1) == pattern.charAt(j-1) || pattern.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                // case2 -> if pattern jth char is '*' 
                else if(pattern.charAt(j-1) == '*') {
                    boolean flag1 = dp[i][j-1];  // '*' is matched with empty char ' '
                    boolean flag2 = dp[i-1][j];  // '*' is matched with single or a group of char
                    dp[i][j] = flag1 || flag2;
                }
                else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        // String string = "baaabab";
        // String pattern = "*****ba*****ab";
        String string = "abc";
        String pattern = "**d";
        System.out.println(WildCardMatching(string, pattern));
    }
}
