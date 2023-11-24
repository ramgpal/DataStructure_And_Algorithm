import java.util.*;
public class LargestEement {
    public static int LargestElementinArray(int nums[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(largest<=nums[i]) {
                largest=nums[i];
            }
        }
        return largest;
    }
    public static void main (String[] args) {
        int nums[] = {2,4,6,8,10};
        System.out.println(LargestElementinArray(nums));
    }
}
