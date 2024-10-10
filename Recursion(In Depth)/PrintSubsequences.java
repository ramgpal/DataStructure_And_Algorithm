import java.util.*;
public class PrintSubsequences {
    public static void printSub(int arr[], int idx, ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> ans) {
        if(idx >=  arr.length) {
            ans.add(new ArrayList<>(tmp));
            return;
        }
        
        // pick
        tmp.add(arr[idx]);
        printSub(arr, idx+1, tmp, ans);

        // not pick
        tmp.remove(tmp.size()-1);
        printSub(arr, idx+1, tmp, ans);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        printSub(arr, 0, new ArrayList<Integer>(), ans);
        for(int i = 0; i < ans.size(); i++) {
           set.add(new ArrayList<>(ans.get(i)));
        }


        for(ArrayList<Integer> i : set) {
            for (int j = 0; j < i.size(); j++) {
                System.out.print(i.get(j) + " ");
            }
            System.out.println();
        }
    }
}
