import java.util.*;
public class climbingStairs {
// Basic Recursion
    public static int countWays(int n) {
        if(n < 0) {
            return 0;
        }
        if(n==0) {
            return 1;
        }
        return countWays(n-1)+countWays(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countWays(n));
    }
}
