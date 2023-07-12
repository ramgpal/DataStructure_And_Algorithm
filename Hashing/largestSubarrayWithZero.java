//Tc-> O(n)
import java.util.*;
public class largestSubarrayWithZero {
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        int len = 0; //length of subArray having sum 0
        for(int j = 0; j<arr.length; j++) {
            sum += arr[j];
            if(map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            }
            else {
                map.put(sum, j);
            }
        }
        System.out.println("Largest subarray with sum as 0: "+ len);
    }
}
