
import java.util.*;
//optimized with TC - O(n)
public class KadanesAgo {
public static int Kadans(int nums[]) {
int currSum=0,maxSum=Integer.MIN_VALUE;
for(int i=0;i<nums.length;i++) {
currSum = currSum+nums[i];
maxSum = Math.max(currSum, maxSum);
if(currSum<0) {
    currSum=0;
}
}
return maxSum;
}  
public static void main (String[] args) {
    int nums[]={-2,-3,4,-1,-2,1,5,-3};
    System.out.println(Kadans(nums));
}
}
