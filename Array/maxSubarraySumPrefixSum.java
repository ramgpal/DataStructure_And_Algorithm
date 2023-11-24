
//with TC - O(n^2)
public class maxSubarraySumPrefixSum {
    public static int PrefixSum(int nums []) {
        int currSum=0,maxSum=Integer.MIN_VALUE;
        int prefixSum[]=new int[nums.length];
        prefixSum[0]=nums[0];
        //calculate prefix array
        for(int i=1;i<prefixSum.length;i++) {
             prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
                currSum=0;
            
               currSum = i==0? prefixSum[j]: prefixSum[j]-prefixSum[i-1];
               maxSum=Math.max(currSum, maxSum);
            } 
        }
    return maxSum; 
            }
       public static void main (String[] args) {
            int nums[] = {1,-2,6,-1,3};
         System.out.println(PrefixSum(nums));
        }
    }

