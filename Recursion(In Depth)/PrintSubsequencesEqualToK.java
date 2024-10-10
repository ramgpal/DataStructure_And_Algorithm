import java.util.*;
public class PrintSubsequencesEqualToK {
    public static void util(int i, int arr[], List<Integer> list, int sum, int k) {
        if(i == arr.length) {
            if(sum == k) {
                print(list);
            }
            return;
        }

        // pick
        list.add(arr[i]);
        util(i+1, arr, list, sum + arr[i], k);

        // not pickup
        list.remove(list.size()-1);
        util(i+1, arr, list, sum, k);
    }
    public static void print(List<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        int k = 2;
        util(0, arr, new ArrayList<>(), 0, k);
    }
}
