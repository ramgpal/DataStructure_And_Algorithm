import java.util.*;

public class intersectionOfTwoSets {
     public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }
        int count = 0; // to count number of intersection 
        for(int i=0;i<arr2.length;i++) {
            if(set.contains(arr2[i])) {
                count++;
                System.out.print( arr2[i] +" ");
                set.remove(arr2[i]);
            }
        }
        System.out.println(count);
    }
}
