

public class PrintPairs {
    public static void printPairs(int nums []) {
    for(int i=0;i<nums.length;i++) {
        int curr=nums[i];
        for(int j=i+1;j<nums.length;j++) {
         System.out.print("("+curr+","+nums[j]+")"+" ");
        }
        System.out.println();
    }
    }
   public static void main (String[] args) {
        int nums[] = {2,4,6,8,10};
     printPairs(nums);
    }
}

//Total pairs=(n*(n-1))/2
//TC - O(n^2)
