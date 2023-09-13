import java.util.*;

public class Knapsack {
    public static int knapsack(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }
        // valid
        if (wt[n - 1] <= W) {
            // Include the current item
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);
            // Exclude the current item
            int ans2 = knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
            // invalid
        } else {
            // If the current item's weight is greater than the remaining capacity, skip it
            return knapsack(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int n = val.length; // Number of items
        int result = knapsack(val, wt, W, n);
        System.out.println("Maximum value: " + result);
    }
}
