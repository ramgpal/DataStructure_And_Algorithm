import java.util.*;

public class permutationsUptoFiveDigits  {

    public static int countPermutations(int N) {
       
        int[] dp = new int[N + 1];

        for (int i = 1; i <= 9; ++i) {
            if (i <= N) {
                dp[i] = 1;
            }
        }

        for (int i = 2; i <= N; ++i) {
            for (int j = 1; j <= 9; ++j) {
                if (i - j > 0) {
                    dp[i] += dp[i - j];
                }
            }
        }

        return dp[N];
    }

    public static void main(String[] args) {
        
        int input1 = 3;
        System.out.println("Input: " + input1 + "\nOutput: " + countPermutations(input1));

        int input2 = 4;
        System.out.println("Input: " + input2 + "\nOutput: " + countPermutations(input2));
    }
}
