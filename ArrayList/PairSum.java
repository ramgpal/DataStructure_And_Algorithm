//Find if any pair in A sorted ArrayList has A target sum
import java.util.*;
public class PairSum {
    public static boolean Pair_Sum(ArrayList<Integer> list,int target) {
        int rp=list.size()-1; //right pointer
        int lp=0; //left pointer
        while(lp!=rp) {
            //case 1
      if(list.get(lp)+list.get(rp) == target) {
        return true;
      }
   if(list.get(lp)+list.get(rp)<target) {
    lp++;
   }
   else
   rp--;
        }  
        return false;
    }
    public static void main (String [] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1); 
        list.add(2); 
        list.add(3); 
        list.add(4); 
        list.add(5);
        int target=13;
        System.out.println(Pair_Sum(list, target));
    }
    }
