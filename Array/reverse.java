

public class reverse {
    public static void reverseArray(int nums[]) {
        int first=0,last=nums.length-1;
        while(first<last) 
       {
          //swapping
          int temp = nums[first];
          nums[first] = nums[last];
          nums[last] = temp;
          first++;
          last--;
       }
       for(int i=0;i<nums.length;i++) {
          System.out.print(nums[i]+" ");
       }
      }
      public static void main (String[] args) {
          int nums[]={2,4,6,8,10};
          reverseArray(nums);
      }
  }
  