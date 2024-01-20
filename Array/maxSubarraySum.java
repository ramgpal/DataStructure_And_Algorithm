public class maxSubarraySum {
    public static int subArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                int currSum = 0;
                for(int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println((subArraySum(arr)));
    }
}
