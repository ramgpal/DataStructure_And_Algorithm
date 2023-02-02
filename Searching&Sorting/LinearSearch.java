class LinearSearch {
    public static int Linear_Search(int nums[],int target) {
        for(int i=0;i<nums.length;i++) {
        if(nums[i]==target) {
            return i;
        }
        }
        return 0;
    }
    public static void main (String[] args) {
        int nums[]={7,5,3,2,5,1};
            int target=1;
            System.out.println(Linear_Search(nums, target));
        }
    }