// TC -> O(n+m)
import java.util.*;
public class UnionOfTwoSets {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++) {
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
}
