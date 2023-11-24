import java.util.*;
//Brute force approach with Tc - O(n^3)
public class MaxSubarraysSum {
    public static int MaxSubarraySum(int nums []) {
        int currSum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
                currSum=0;
            for(int k=i;k<=j;k++) {
               currSum = currSum+nums[k];
               maxSum=Math.max(currSum, maxSum);
            } 
        }
    }
    return maxSum;
            }
       public static void main (String[] args) {
            int nums[] = {2,4,6,8,10};
         System.out.println(MaxSubarraySum(nums));
        }
    }

