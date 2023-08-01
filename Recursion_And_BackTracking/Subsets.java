// TC - O(n*2^n)
import java.util.*;
public class Subsets {
    public static void findSubsets(String str, String ans, int i) {
    // Base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
    // Kaam
        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        String temp = "";
        int idx = 0;
        findSubsets( str, temp, idx);
    }
}


// 78. Leetcode solution
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        findSubsets(nums, ans, curr, 0);
        return ans;
    }
    public void findSubsets(int[] nums, List<List<Integer>> ans, List<Integer> curr, int idx) {
        // Base case: If we have processed all elements, add the current subset to the answer
        if (idx == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Recursive calls: Explore two possibilities - including or excluding the current element
        // Choice 1: Include the current element
        curr.add(nums[idx]);
        findSubsets(nums, ans, curr, idx + 1);

        // Choice 2: Exclude the current element
        curr.remove(curr.size() - 1);
        findSubsets(nums, ans, curr, idx + 1);
    }
}
