import java.util.*;
public class majorityElement {
    public static void main(String [] args) {
        // int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        int nums[] = {2,2,1,1,1,2,2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i], 1);
            }

            // hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1); // line 7 to 13 tak ke code ka shortcut
        }
        //iterete on map to access number which larger than (nums.length/3)
         Set<Integer> keySet = hm.keySet();
         for (Integer key: keySet) {
            // Line 17 to 18 ka shortcut -> for(Integer key: hm.keySet()) {}
            if(hm.get(key) > nums.length/2) {
                System.out.println(key);
            }
         }
    }
}
