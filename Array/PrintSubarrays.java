

public class PrintSubarrays {
    public static void printSubarrays(int nums []) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i;j<nums.length;j++) {
                //loop to print
            for(int k=i;k<=j;k++) {
                System.out.print(nums[k]+" "); //subarrays
            }
            System.out.println();
        }
        System.out.println();
    }
            }
       public static void main (String[] args) {
            int nums[] = {2,4,6,8,10};
         printSubarrays(nums);
        }
    }

    //Total subarrays = (n*(n+1))/2