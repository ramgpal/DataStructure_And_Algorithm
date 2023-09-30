//Find if any pair in A sorted & Rotated ArrayList has A target sum
import java.util.*;
class PairSum2 {
    public static boolean Pair_Sum(ArrayList<Integer> list, int target) {
      //to find pivot (Rotating point)
        int pivot=-1;
        for(int i=0;i<list.size()-1;i++) {
            if(list.get(i)>list.get(i+1)) {
                pivot=i; //rotating point
            }
        }
        // This is a java program
        int lp = pivot+1;  //smallest
         int rp=pivot;     //largest
         while(lp!=rp) {
            if(list.get(lp)+list.get(rp) == target) {
                return true;
              }
           if(list.get(lp)+list.get(rp)<target) {
            lp=(lp+1)%list.size();
           }
           else
           rp = (rp+list.size()-1)%list.size();
                }
            return false;      
         }
         public static void main (String [] args) {
            ArrayList<Integer> list=new ArrayList<>();
            list.add(11); 
            list.add(15); 
            list.add(6); 
            list.add(8); 
            list.add(9);
            list.add(10);
            int target=16;
            System.out.println(Pair_Sum(list, target));
    }
}

