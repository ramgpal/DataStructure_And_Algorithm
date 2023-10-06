public class MCM {
    public static int mcm(int arr[], int i, int j) {
        if(i == j) {
            return 0; // A single matrix or no matrix
        }
        
        int ans = Integer.MAX_VALUE;
        for(int k = i; k < j; k++) {
            int cost1 = mcm(arr, i, k);
            int cost2 = mcm(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
           ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3}; // n = 5
        int n = arr.length;
        int i = 1;
        int j = n - 1;
        System.out.println(mcm(arr, i, j));
    }
}
